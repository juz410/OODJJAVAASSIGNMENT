/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Appointment 
{
    String aptID,userID,centerID, state, date, time, aptStatus, vacType, vacID, vacDose;
    File file = new File("Appointment.txt");
    boolean pass = false;
    
    public Appointment()
    {
        
    }
    
    public Appointment(String aptID, String userID, String centerID, String state, String date,
            String time, String aptStatus, String vacType, String vacID, String vacDose)
    {
        this.aptID = aptID;
        this.userID = userID;
        this.centerID = centerID;
        this.state = state;
        this.date = date;
        this.time = time;
        this.aptStatus = aptStatus;
        this.vacType = vacType;
        this.vacID = vacID;
        this.vacDose = vacDose;
    }
    
    //set method
    public void setAptID(String aptID){this.aptID = aptID;}
    public void setUserID(String userID){this.userID = userID;}
    public void setCenterID(String centerID){this.centerID = centerID;}
    public void setState(String state){this.state = state;}
    public void setDate(String date){this.date = date;}
    public void setTime(String time){this.time = time;}
    public void setAptStatus(String aptStatus){this.aptStatus = aptStatus;}
    public void setVacType(String vacType){this.vacType = vacType;}
    public void setVacDose(String vacDose){this.vacDose = vacDose;}
    //get method
    public String getAptID(){return this.aptID;}
    public String getUserID(){return this.userID;}
    public String getCenterID(){return this.centerID;}
    public String getState(){return this.state;}
    public String getDate(){return this.date;}
    public String getTime(){return this.time;}
    public String getAptStatus(){return this.aptStatus;}
    public String getVacType(){return this.vacType;}
    public String getVacDose(){return this.vacDose;}
    
    public boolean appointmentRegister(String aptStatus)
    {
        this.aptStatus = aptStatus;
        int aptNum = 1;
        try 
        {
            BufferedReader aptIDCheck = new BufferedReader(new FileReader(file));
            String readline;
            try {
                while((readline = aptIDCheck.readLine())!= null)
                {
                    String [] aptIDArray = readline.split("\\|");
                    if(aptIDArray[0].startsWith("APT"))
                    {
                        aptNum ++;
                    }
                }
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        DecimalFormat formatter = new DecimalFormat("00000000");
        String AptNum = formatter.format(aptNum);
        this.aptID = "APT" + AptNum;
        
        try 
        {
            FileWriter appointmentWriter = new FileWriter(file,true);
            PrintWriter appointmentPWriter = new PrintWriter(appointmentWriter);
            if ("Requesting".equals(aptStatus))
            {
                int n = JOptionPane.showOptionDialog(null, "<html> Appointment ID: " + this.aptID + 
                        "<br> Center ID: " + this.centerID +
                        "<br> Date: " + this.date + 
                        "<br> Time: " + this.time + 
                        "<br> Vaccine Type: " + this.vacType + 
                        "<br> Dose: " + this.vacDose + " <html>",
                        "Check", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,null,null,null);
                switch (n)
                {
                    case 0:
                        appointmentPWriter.println(this.aptID + "|" + 
                                this.userID + "|" +
                                this.centerID + "|" + 
                                this.state + "|" + 
                                this.date + "|" +
                                this.time + "|" + 
                                this.aptStatus + "|" + 
                                this.vacType + "|" +
                                this.vacDose);

                        JOptionPane.showMessageDialog(null, "Appointment Registration is Successful!");
                        pass = true;
                        break;
                    case 1:
                        break;
                }
            }
            else if ("Request Cancellation".equals(aptStatus))
            {
                 int n = JOptionPane.showOptionDialog(null, "Are you sure want to cancel appointment?","Comfirmation",
                JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,null,null);
                switch (n)
                {
                    case 0:
                        appointmentPWriter.println(this.aptID + "|" + 
                                        this.userID + "|" +
                                        this.centerID + "|" + 
                                        this.state + "|" + 
                                        this.date + "|" +
                                        this.time + "|" + 
                                        this.aptStatus + "|" + 
                                        this.vacType + "|" +
                                        this.vacDose);
                        
                        JOptionPane.showMessageDialog(null, "Request Sent!");
                        pass = true;
                        break;
                    case 1:
                        break;
                }
            appointmentWriter.close();
            appointmentPWriter.close();
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        return pass;
    }
    
    public boolean viewAppointment(String userID)
    {
        try {
            Scanner appointmentReader = new Scanner(file);
            while(appointmentReader.hasNextLine())
            {
                String[] appointmentArray= appointmentReader.nextLine().split("\\|"); 
                if(appointmentArray[1].equals(userID))
                {
                    this.aptID = appointmentArray[0];
                    this.userID = appointmentArray[1];
                    this.centerID = appointmentArray[2];
                    this.state = appointmentArray[3];
                    this.date = appointmentArray[4];
                    this.time = appointmentArray[5];
                    this.aptStatus = appointmentArray[6];
                    this.vacType = appointmentArray[7];
                    this.vacDose = appointmentArray[8];
                    pass = true;
                }
                else 
                {
                    pass = false;
                }
            }
            appointmentReader.close();
        } 
        catch (FileNotFoundException ex) 
        {
            ex.printStackTrace();
        }
        return pass;
    }
    
    public void modifyAppointment(String userID)
    {
        List<String> appointmentList = new ArrayList<String>(); ; //list for storing all data
        String[] appointmentArrayModify = {}; //count which line is the user account
        int count = -1;
        try 
        {
            appointmentList = Files.readAllLines(Paths.get("Appointment.txt"), Charset.defaultCharset()); //store all data into list
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try 
        {
            Scanner myReader = new Scanner(file);
            do
            {
                appointmentArrayModify = myReader.nextLine().split("\\|"); 
                count += 1;
                if(appointmentArrayModify[1].equals(userID))
                {
                  break;
                } 
            }while(myReader.hasNextLine());
            myReader.close();
        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        
        appointmentList.remove(count); //remove the old record
        
        String[] arr = appointmentList.toArray(new String[appointmentList.size()]); //convert list into array
        arr[0].split(",");
        
        try 
        {
            FileWriter myWriter = new FileWriter(file);
            for (String arr1 : arr) 
            {
                myWriter.write(arr1 + "\n");
            }
            myWriter.close();
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
     public static String[] VaccineViewAll()  //Returning all requesting appointments to the tblRequestedAppTable in AdminVaccinePage
    {
        File file = new File("Appointment.txt");
        int count = 0;
        String [] lineArray = new String[0];
        try {
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine())
            {
                String line = myReader.nextLine(); 
                String[] checkArr = line.split("\\|");
                if(checkArr[6].equals(AppStatus.Requesting.toString()) || count == 0)
                {
                    lineArray = Arrays.copyOf(lineArray, count + 1);
                    lineArray[count] = line;
                    count += 1;
                }else
                {
                    continue;
                }
                
                
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lineArray;
    }
     
}
enum AppStatus
{
    Requesting,
    Approved,
    Canceled,
    RequestingCancel,
    Rejected,
    Done;
    
}
