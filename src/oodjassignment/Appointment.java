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
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Appointment 
{
    String aptID,userID,centerID, address, date, time, aptStatus, vacType, vacID, vacDose;
    File file = new File("Appointment.txt");
    boolean pass = false;
    
    public Appointment()
    {
        
    }
    
    public Appointment(String aptID, String userID, String centerID, String address, String date,
            String time, String aptStatus, String vacType, String vacID, String vacDose)
    {
        this.aptID = aptID;
        this.userID = userID;
        this.centerID = centerID;
        this.address = address;
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
    public void setAddress(String address){this.address = address;}
    public void setDate(String date){this.date = date;}
    public void setTime(String time){this.time = time;}
    public void setAptStatus(String aptStatus){this.aptStatus = aptStatus;}
    public void setVacType(String vacType){this.vacType = vacType;}
    public void setVacDose(String vacDose){this.vacDose = vacDose;}
    public void setVacID(String vacID){this.vacID = vacID;}
    //get method
    public String getAptID(){return this.aptID;}
    public String getUserID(){return this.userID;}
    public String getCenterID(){return this.centerID;}
    public String getAddress(){return this.address;}
    public String getDate(){return this.date;}
    public String getTime(){return this.time;}
    public String getAptStatus(){return this.aptStatus;}
    public String getVacType(){return this.vacType;}
    public String getVacDose(){return this.vacDose;}
    public String getVacID() {return this.vacID;}
    
    public boolean appointmentRegister()
    {
        String aptStatus = "Requesting";
        String vacID = "NULL";
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
                            this.address + "|" + 
                            this.date + "|" +
                            this.time + "|" + 
                            aptStatus + "|" + 
                            this.vacType + "|" +
                            vacID + "|" +
                            this.vacDose);
                    JOptionPane.showMessageDialog(null, "Appointment Registration is Successful!");
                    pass = true;
                    break;
                case 1:
                    break;
            }
            appointmentWriter.close();
            appointmentPWriter.close();
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
                if(appointmentArray[1].equals(userID) && !"Done".equals(appointmentArray[6]))
                {
                    pass = true;
                }
                else
                {
                    pass = false;
                }
                
                this.aptID = appointmentArray[0];
                this.userID = appointmentArray[1];
                this.centerID = appointmentArray[2];
                this.address = appointmentArray[3];
                this.date = appointmentArray[4];
                this.time = appointmentArray[5];
                this.aptStatus = appointmentArray[6];
                this.vacType = appointmentArray[7];
                this.vacDose = appointmentArray[8];
                this.vacID = appointmentArray[9];
            }
            appointmentReader.close();
        } 
        catch (FileNotFoundException ex) 
        {
            ex.printStackTrace();
        }
        return pass;
    }
    
    public void appointmentModify()
    {
        String newline = "";
        String [] appointmentArr = new String[0];
        FileWriter fw;
        
        try {
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine())
            {
                appointmentArr = Arrays.copyOf(appointmentArr, appointmentArr.length + 1);
                appointmentArr[appointmentArr.length - 1] = myReader.nextLine();
                
            }
            myReader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            fw = new FileWriter(file,false);
            fw.write("");
            fw.close();
            
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < appointmentArr.length; i ++)
        {
            String [] list = appointmentArr[i].split("\\|");
            if(list[1].equals(this.userID))
            {
                list[6] = this.aptStatus;
            }
            appointmentArr[i] = String.join("|", list);
            
        }
        
        try {
            fw = new FileWriter(file,true);
            for (int i = 0; i < appointmentArr.length;i++)
            {
                if(i != 0)
                {
                   newline = "\n";
                }
                fw.write(newline + appointmentArr[i]);
                
            }
            
            fw.close();
        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }
    }
    
    public void digitalCertificate(String userID, String dose)
    {
        try 
        {
            Scanner appointmentReader = new Scanner(file);
            while(appointmentReader.hasNextLine())
            {
                String[] appointmentArray= appointmentReader.nextLine().split("\\|"); 
                if(appointmentArray[1].equals(userID) && "Done".equals(appointmentArray[6]) && 
                        appointmentArray[8].equals(dose))
                {
                    this.centerID = appointmentArray[2];
                    this.date = appointmentArray[4];
                    this.vacType = appointmentArray[7];
                    this.vacID = appointmentArray[9];
                    break;
                }
                else
                {
                    this.centerID = "NULL";
                    this.date = "NULL";
                    this.vacType = "NULL";
                    this.vacID = "NULL";   
                }
            }
            
            appointmentReader.close();
        } 
        catch (FileNotFoundException ex) 
        {
            ex.printStackTrace();
        }
    }
    
}
