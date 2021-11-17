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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Appointment 
{
    private String aptID,userID,centerID, address, date, time, vacType, vacID, vacDose;
    private final File file = new File("Appointment.txt");
    private boolean pass = false;
    private AppStatus aptStatus;
    private String adminID;
     
    
    public Appointment()
    {
        
    }
    
    public Appointment(String userID, String address, String centerID, String date,
            String time,String vacType, String vacDose)
    {
        this.userID = userID;
        this.address = address;
        this.centerID = centerID;
        this.date = date;
        this.time = time;
        this.vacType = vacType;
        this.vacDose = vacDose;
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
        this.aptStatus = AppStatus.valueOf(aptStatus);
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
    public void setAptStatus(String aptStatus){this.aptStatus = AppStatus.valueOf(aptStatus);}
    public void setVacType(String vacType){this.vacType = vacType;}
    public void setVacID(String vacID){this.vacID = vacID;}
    public void setVacDose(String vacDose){this.vacDose = vacDose;}
    public void setAdminID(String adminID){this.adminID = adminID;}
    //get method
    public String getAptID(){return this.aptID;}
    public String getUserID(){return this.userID;}
    public String getCenterID(){return this.centerID;}
    public String getAddress(){return this.address;}
    public String getDate(){return this.date;}
    public String getTime(){return this.time;}
    public String getAptStatus(){return this.aptStatus.toString();}
    public String getVacType(){return this.vacType;}
    public String getVacID(){return this.vacID;}
    public String getVacDose(){return this.vacDose;}
    public String getAdminID(){return this.adminID;}
    
    public boolean appointmentRegister()
    {
        String aptStatus = "Requesting";
        String vacID = "NULL";
        this.aptStatus = AppStatus.valueOf(aptStatus);
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
                    appointmentPWriter.print("\n" + this.aptID + "|" + 
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
        int count = 0;
        try {
            Scanner appointmentReader = new Scanner(file);
            while(appointmentReader.hasNextLine())
            {
                String[] appointmentArray= appointmentReader.nextLine().split("\\|"); 
                if(count > 0)
                {
                    if(appointmentArray[1].equals(userID) && !"Done".equals(appointmentArray[6]))
                    {
                        this.aptID = appointmentArray[0];
                        this.userID = appointmentArray[1];
                        this.centerID = appointmentArray[2];
                        this.address = appointmentArray[3];
                        this.date = appointmentArray[4];
                        this.time = appointmentArray[5];
                        this.aptStatus = AppStatus.valueOf(appointmentArray[6]);
                        this.vacType = appointmentArray[7];
                        this.vacDose = appointmentArray[9];
                        this.vacID = appointmentArray[8];
                        pass = true;
                    }
                    else
                    {
                        pass = false;
                    }
                }
                count += 1;
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
                list[6] = this.aptStatus.toString();
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
    
    public boolean digitalCertificate(String userID, String dose)
    {
        try 
        {
            Scanner appointmentReader = new Scanner(file);
            while(appointmentReader.hasNextLine())
            {
                String[] appointmentArray= appointmentReader.nextLine().split("\\|"); 
                if(appointmentArray[1].equals(userID) && "Done".equals(appointmentArray[6]) && 
                        appointmentArray[9].equals(dose))
                {
                    this.centerID = appointmentArray[2];
                    this.date = appointmentArray[4];
                    this.vacType = appointmentArray[7];
                    this.vacID = appointmentArray[8];
                    pass = true;
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
        return pass;
    }
    
     public static String[] AppointmentViewAll(AppStatus aptStatus,AppStatus aptStatus2)  //Returning all requesting appointments to the tblRequestedAppTable in AdminVaccinePage (KF)
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
                if(checkArr[6].equals(aptStatus.toString()) || count == 0 || checkArr[6].equals(aptStatus2.toString()))
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
     
     
     public void AppointmentTimeModify()
     {
         String [] aptArr = this.returnFileLine();
         /////TRACKING RECORD/////
        ArrayList<AModifyAppointmentTracking> MTrackArr= new ArrayList<>();
        CurrentDateTime cdt = new CurrentDateTime();
        AModifyAppointmentTracking MTrack = new 
                 AModifyAppointmentTracking("",this.adminID,this.aptID,ActionType.Modify,TargetType.Appointment,cdt.currentDate(),cdt.currentTime(),"");
         MTrackArr = MTrack.FileRead();
         String trackingID = MTrack.setTrackingIDAuto(MTrackArr.size());
         MTrack.setTrackingID(trackingID);
         /////////////////////////////////////////////////
         this.fileCleaning();
         this.changingData(aptArr, this.aptStatus.toString());
          //////////////////Writing Tracking record/////////////////////////
            String remark = "Date: " + this.date + "Time: " + this.time; 
            MTrack.setRemark(remark);
            MTrackArr.add(MTrack);
            MTrack.FileWrite(MTrackArr);
            ////////////////////////////////////////////
         JOptionPane.showMessageDialog(null, "Appointment Modified succesful!!!");
     }
     public void DoneAppointment()
     {
         /////TRACKING RECORD/////
        ArrayList<AModifyAppointmentTracking> MTrackArr= new ArrayList<>();
        CurrentDateTime cdt = new CurrentDateTime();
        AModifyAppointmentTracking MTrack = new 
                 AModifyAppointmentTracking("",this.adminID,this.aptID,ActionType.CompleteApp,TargetType.Appointment,cdt.currentDate(),cdt.currentTime(),"");
         MTrackArr = MTrack.FileRead();
         String trackingID = MTrack.setTrackingIDAuto(MTrackArr.size());
         MTrack.setTrackingID(trackingID);
         /////////////////////////////////////////////////
         VCenter vc = new VCenter(this.centerID);
         vc.setVacType(VType.valueOf(this.vacType));
         this.aptStatus = AppStatus.Done; // NEW APP STATS
         String previousStats = AppStatus.Approved.toString();
         this.vacID = vc.AssignVaccine(VStatus.Booked, VStatus.Used); //prestats and new stats of vaccines
         String[] aptArr = this.returnFileLine();
         this.fileCleaning();
         this.changingData(aptArr, previousStats);
          //////////////////Writing Tracking record/////////////////////////
            String remark = JOptionPane.showInputDialog("Please insert your remark here admin");
            MTrack.setRemark(remark);
            MTrackArr.add(MTrack);
            MTrack.FileWrite(MTrackArr);
            ////////////////////////////////////////////
         Users user = new Users();
         user.setUserID(this.userID);
         user.userDoneVaccine(this.vacDose);
         
     }
     
     public void cancelUserAppointment(AppStatus preStats)
     {
         
         /////TRACKING RECORD/////
        ArrayList<AModifyAppointmentTracking> MTrackArr= new ArrayList<>();
        CurrentDateTime cdt = new CurrentDateTime();
        AModifyAppointmentTracking MTrack = new 
                 AModifyAppointmentTracking("",this.adminID,this.aptID,ActionType.Remove,TargetType.Appointment,cdt.currentDate(),cdt.currentTime(),"");
         MTrackArr = MTrack.FileRead();
         String trackingID = MTrack.setTrackingIDAuto(MTrackArr.size());
         MTrack.setTrackingID(trackingID);
         /////////////////////////////////////////////////
         VCenter vc = new VCenter(this.centerID);
         vc.setVacType(VType.valueOf(this.vacType));
         vc.AssignVaccine(VStatus.Booked, VStatus.InStock);
         this.vacID = "NULL";
         String previousStats = preStats.toString();
         this.aptStatus = AppStatus.Cancelled;
         String [] aptArr = this.returnFileLine();
         this.fileCleaning();
         this.changingData(aptArr, previousStats);
         //////////////////Writing Tracking record/////////////////////////
            String remark = JOptionPane.showInputDialog("Please insert your remark here admin");
            MTrack.setRemark(remark);
            MTrackArr.add(MTrack);
            MTrack.FileWrite(MTrackArr);
            ////////////////////////////////////////////
         JOptionPane.showMessageDialog(null, "Appointment Canceled");
     }
     public void RejectUserAppRequest()
     {
        /////TRACKING RECORD/////
        ArrayList<AModifyAppointmentTracking> MTrackArr= new ArrayList<>();
        CurrentDateTime cdt = new CurrentDateTime();
        AModifyAppointmentTracking MTrack = new 
                 AModifyAppointmentTracking("",this.adminID,this.aptID,ActionType.Reject,TargetType.Appointment,cdt.currentDate(),cdt.currentTime(),"");
         MTrackArr = MTrack.FileRead();
         String trackingID = MTrack.setTrackingIDAuto(MTrackArr.size());
         MTrack.setTrackingID(trackingID);
         /////////////////////////////////////////////////
        String previousStats = AppStatus.Requesting.toString();
        this.aptStatus = AppStatus.Rejected;
        String[] aptArr = this.returnFileLine();
        this.fileCleaning();
        this.changingData(aptArr, previousStats);
         //////////////////Writing Tracking record/////////////////////////
            String remark = JOptionPane.showInputDialog("Please insert your remark here admin");
            MTrack.setRemark(remark);
            MTrackArr.add(MTrack);
            MTrack.FileWrite(MTrackArr);
            ////////////////////////////////////////////
        JOptionPane.showMessageDialog(null, "Appointment Rejected");
     }
     public void ApproveUserAppRequest() //KF
     {
         VCenter vc = new VCenter(this.centerID);
         vc.setVacType(VType.valueOf(this.vacType));
         
         
        /////TRACKING RECORD/////
        ArrayList<AModifyAppointmentTracking> MTrackArr= new ArrayList<>();
        CurrentDateTime cdt = new CurrentDateTime();
         AModifyAppointmentTracking MTrack = new 
                 AModifyAppointmentTracking("",this.adminID,this.aptID,ActionType.Approve,TargetType.Appointment,cdt.currentDate(),cdt.currentTime(),"");
         MTrackArr = MTrack.FileRead();
         String trackingID = MTrack.setTrackingIDAuto(MTrackArr.size());
         MTrack.setTrackingID(trackingID);
         /////////////////////////////////////////////////
         int VCenterVacQuantity = VCenter.calCenterVacQuantity(VType.valueOf(this.vacType), this.centerID);
         if (VCenterVacQuantity > 0)
         {
           
            String previousStats = AppStatus.Requesting.toString();
            this.vacID =vc.AssignVaccine(VStatus.InStock,VStatus.Booked); //Previous Stats and New Stats
             this.aptStatus = AppStatus.Approved;
            String[] aptArr = this.returnFileLine();
            this.fileCleaning();
            this.changingData(aptArr, previousStats);
            //////////////////Writing Tracking record/////////////////////////
            String remark = JOptionPane.showInputDialog("Please insert your remark here admin");
            MTrack.setRemark(remark);
            MTrackArr.add(MTrack);
            MTrack.FileWrite(MTrackArr);
            ////////////////////////////////////////////
            JOptionPane.showMessageDialog(null, "Appointment Scheduled");
             
         }else
         {
             JOptionPane.showMessageDialog(null, "NOT Enough Vaccine for "+this.vacType+", Please check the stock");
         }
         
     }
     private String[] returnFileLine()
    {
        String [] Arr = new String[0];
        File file = new File("Appointment.txt");
        
        //////To take out all data from the txt file
        try {
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine())
            {
                Arr = Arrays.copyOf(Arr, Arr.length + 1);
                Arr[Arr.length - 1] = myReader.nextLine();
                
            }
            myReader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Arr;
    }
    private void fileCleaning() //KF
    {
        File file = new File("Appointment.txt");
        FileWriter fw;
        try {
            fw = new FileWriter(file,false);
            PrintWriter pw = new PrintWriter(fw,false);
            pw.flush();
            pw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void changingData(String [] Arr,String previousStats)  //KF
    {
      
        File file = new File("Appointment.txt");
        
        
        
        for (int i = 0; i < Arr.length; i ++)
        {
            
            
            String [] list = Arr[i].split("\\|");
            
            {
                if(list[6].equals(previousStats) && list[0].equals(this.aptID))
                {
                    
                    list[6] = this.aptStatus.toString();
                    list[8] = this.vacID;
                    list[4] = this.date;
                    list[5] = this.time;
                    
                    
                    
                    
                }else
                {
                    
                    continue;
                }
                
            }
            
            Arr[i] = String.join("|", list);
            
        }
        FileWriter fw;
        try {
            fw = new FileWriter(file,true);
            PrintWriter pw = new PrintWriter(fw,true);
            for (int i = 0; i < Arr.length;i++)
            {
                
                pw.println(Arr[i]);
                
            }
            
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     public int checkRow(String centerID, String date)
    {
        int count = 0;
        try 
        {
            Scanner appointmentReader = new Scanner(file);
            while(appointmentReader.hasNextLine())
            {
                String[] appointmentArray= appointmentReader.nextLine().split("\\|"); 
                if(appointmentArray[2].equals(centerID) && appointmentArray[4].equals(date) && 
                        "Approved".equals(appointmentArray[6]))
                {
                    count +=1;
                }
            }
            appointmentReader.close();
        } 
        catch (FileNotFoundException ex) 
        {
            ex.printStackTrace();
        }
        return count;
    }
     
     public String getAddress(String centerID)
     {
         try //set the label address same as the database address
        {
            File file = new File("VCenter.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) 
            {
                String[] arr = myReader.nextLine().split("\\|"); 
                if (centerID.equals(arr[0]))
                {
                    this.address = arr[2];
                }
            }
            myReader.close();
          } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
         return this.address;
     }
     
     public boolean firstDoseDone(String userID)
    {
        try 
        {
            Scanner appointmentReader = new Scanner(file);
            while(appointmentReader.hasNextLine())
            {
                String[] appointmentArray= appointmentReader.nextLine().split("\\|"); 
                {
                    if(appointmentArray[1].equals(userID) && "Done".equals(appointmentArray[6]) &&
                            appointmentArray[9].equals("FirstDose"))
                    {
                        this.date = appointmentArray[4];
                        pass = true;
                    }
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
     
}
enum AppStatus
{
    Requesting,
    Approved,
    Cancelled,
    RequestingCancel,
    Rejected,
    Done,
    AppStatus;
}
