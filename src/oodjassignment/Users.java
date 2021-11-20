/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
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

/**
 *
 * @author User
 */
public class Users {
    private String userID, Password,Name,IC,PhoneNo,Email,Address,State,Country;
    private UVacStatus VacStatus;
    private String confirmPassword;
    private String Gender;
    private final File file = new File("User.txt");
    private boolean pass = false;
    private final Validation validation = new Validation();
    
    public Users(){}
    public Users(String UID, String P, String N) //Constructor for admin 
    {
        this.userID = UID;
        this.Password = P;
        this.Name = N;
    }
    
    public Users(String UID, String N, String P,String G, String pNo, String Email, String Ad, String IC, String state,String count, String VacSta)//Constructor for normal user
    {
        this.userID = UID;
        this.Password = P;
        this.Name = N;
        this.Gender = G;
        this.IC = IC;
        this.PhoneNo = pNo;
        this.Email = Email;
        this.Address = Ad;
        this.State = state;
        this.Country = count; //IF the country is MALAYSIA then = LOCAL Citizen, ELSE Non-Citizen
        this.VacStatus = UVacStatus.valueOf(VacSta);
    }
    //set method
    public void setUserID(String UID){this.userID = UID;}
    public void setPassword(String P){this.Password = P;}
    public void setName(String N){this.Name = N;}
    public void setGender(String G){this.Gender = G;}
    public void setIC(String IC){this.IC = IC;}
    public void setPhoneNo(String PN){this.PhoneNo = PN;}
    public void setEmail(String E){this.Email = E;}
    public void setAddress(String Add){this.Address = Add;}
    public void setState(String S){this.State = S;}
    public void setCountry(String C){this.Country = C;}
    public void setVacStatus(String VS){this.VacStatus = UVacStatus.valueOf(VS);}
    public void setCPassword(String CP){this.confirmPassword = CP;}
    //get method
    public String getUserID(){return this.userID;}
    public String getPassword(){return this.Password;}
    public String getName(){return this.Name;}
    public String getGender(){return this.Gender;}
    public String getIC(){return this.IC;}
    public String getPhoneNo(){return this.PhoneNo;}
    public String getEmail(){return this.Email;}
    public String getAddress(){return this.Address;}
    public String getState(){return this.State;}
    public String getCountry(){return this.Country;}
    public String getVacStatus(){return this.VacStatus.toString();}
    public String getCPassword(){return this.confirmPassword;}
    
    public boolean adminLogin()
    {
        Boolean access = false;
        try {
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine())
            {
                
                String line = myReader.nextLine(); //File reading line by line
                
                String [] userArray = line.split("\\|"); //Splitting the line into different index using String[] Array
                
                if(userArray[0].equals(this.userID) && userArray[2].equals(this.Password))
                {
                    
                    access = true;
                    
                    break;
                }
                
            }
            if (access == false)
            {
                JOptionPane.showMessageDialog(null,"Wrong UserID or Password", "Unable to login",JOptionPane.WARNING_MESSAGE);
            }
            
//        new AdminMainPage().setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return access;
    }
    
    private boolean Succesful = false;
    public boolean Succesful(){
        return this.Succesful;
    }
     
    public boolean userLogin()
    {
        boolean access = false;
        try {
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine())
            {
                
                String line = myReader.nextLine(); //File reading line by line
                
                String [] userArray = line.split("\\|"); //Splitting the line into different index using String[] Array
                
                if(userArray[0].equals(this.userID) && userArray[2].equals(this.Password))
                {
                    access = true;
                    UserMainPage userMain = new UserMainPage(this.userID);
                    userMain.setVisible(true);
                    break;
                }
            }
            if (access == false)
            {
                JOptionPane.showMessageDialog(null,"Wrong UserID or Password", "Unable to login",JOptionPane.WARNING_MESSAGE);
            }
            
            
//        new AdminMainPage().setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return access;
    }
    
    public boolean adminRegister()
    {
        int adminNum = 1;
        try 
        {
            BufferedReader adminIDCheck = new BufferedReader(new FileReader(file));
            String readline;
            try {
                while((readline = adminIDCheck.readLine())!= null)
                {
                    String [] adminArray = readline.split("\\|");
                    if(adminArray[0].startsWith("Admin"))
                    {
                        adminNum ++;
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
        DecimalFormat formatter = new DecimalFormat("00");
        String adminNumID = formatter.format(adminNum);

        String adminID = "Admin" + adminNumID;
        
        if(validation.confirmPassword(this.Password, this.confirmPassword ))
        {
            try
            {
                FileWriter userFileWriter = new FileWriter("User.txt",true);
                PrintWriter userPrintWriter = new PrintWriter(userFileWriter);
                int n = JOptionPane.showOptionDialog(null,
                    "<html> UserID: "+ adminID + "<br> Name: " + this.Name+ " <html>", "check",
                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,null,null,null);
                switch (n)
                {
                    case 0:
                        userPrintWriter.println(adminID + "|"+ this.Name+"|"+ this.Password + "|" + "|" + "|" 
                            + "|" + "|" + "|" + "|" + "|");
                        JOptionPane.showMessageDialog(null, "Registration Success!");
                        pass = true;
                    case 1:
                        break;
                }
                userFileWriter.close();
                userPrintWriter.close();
            }    
            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null,"An error occurred.");
                e.printStackTrace();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Password doesn't match!");
        }
        return pass;
    }
    
    public boolean userRegister()
    {
        String VaccineStatus = UVacStatus.NoDose.toString();
        
        if (validation.confirmPassword(this.Password, this.confirmPassword))
        {
            if(validation.passwordValid(this.Password))
            {
                if (validation.phoneValid(this.PhoneNo))
                {
                    if (validation.emailValid(this.Email))
                    {
                        if (validation.icValid(this.IC))
                        {
                            if(validation.icDuplicateValid(this.userID)) //avoid userID duplicate
                            {
                                try 
                                {
                                    FileWriter userFileWriter = new FileWriter(file,true);
                                    PrintWriter userPrintWriter = new PrintWriter(userFileWriter);
                                    
                                    int n = JOptionPane.showOptionDialog(null,
                                        "<html> UserID: "+ this.userID + "<br> Name: " + this.Name+
                                        "<br> Gender: " + this.Gender +
                                        "<br> Phone: " + this.PhoneNo + "<br> Email: " +this.Email+
                                        "<br> Address: " +this.Address + "<br> IC/Passport: " + this.IC +
                                        "<br> State: " +this.State +
                                        "<br> Country: " +this.Country + " <html>", "Comfirmation",
                                        JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,null,null,null);
                                    switch (n)
                                    {
                                        case 0:
                                            userPrintWriter.println(this.userID +"|"+ 
                                            this.Name+"|"+
                                            this.Password+ "|" +
                                            this.Gender+ "|"+
                                            this.PhoneNo+ "|"+
                                            this.Email+ "|"+
                                            this.Address+ "|"+
                                            this.IC+ "|"+
                                            this.State+ "|"+
                                            this.Country + "|"+ VaccineStatus);

                                            JOptionPane.showMessageDialog(null, "Registration Success!");
                                            pass = true;
                                            break;
                                        case 1:
                                        break;
                                    }
                                    userFileWriter.close();
                                    userPrintWriter.close();
                                    return pass;
                                }
                                catch (IOException e) 
                                {
                                    JOptionPane.showMessageDialog(null,"An error occurred.");
                                    e.printStackTrace();
                                }
                            }
                            else //phone number exist
                            {
                                JOptionPane.showMessageDialog(null,"You are already registered! ","Duplicated IC Number",
                            JOptionPane.WARNING_MESSAGE);
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "<html> Please enter valid IC/passport! <br> "
                                    + "[format: xxxxxx-xx-xxxx] <html>");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Please enter valid email!");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please enter valid phone number!");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"<html> Please choose a stronger password!"
                        + " <br> Try a mix of letters, numbers, and symbols. "
                        + " <br< [format: Abcd123@] </html>");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"<html> Those passwords didn’t match! <br> Try again. </html>");
        }
        return pass;
    }
    
    public String[] userViewAll()
    {
        int count = 0;
        String [] lineArray = new String[0];
        try {
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine())
            {
                String line = myReader.nextLine(); 
                lineArray = Arrays.copyOf(lineArray, count + 1);
                lineArray[count] = line;
                
                count += 1;
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lineArray;
    }
    
    public void userProfile(String userID)
    {
        try {
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine())
            {
                String[] userArray= myReader.nextLine().split("\\|"); 
                if(userArray[0].equals(userID))
                {
                    this.userID = userArray[0];
                    this.Name = userArray[1];
                    this.Password = userArray[2];
                    this.Gender = userArray[3];
                    this.PhoneNo = userArray[4];
                    this.Email = userArray[5];
                    this.Address = userArray[6];
                    this.IC = userArray[7];
                    this.State = userArray[8];
                    this.Country = userArray[9];
                    this.VacStatus = UVacStatus.valueOf(userArray[10]);
                }
            }
            myReader.close();
        } catch (FileNotFoundException ex) 
        {
            ex.printStackTrace();
        }
    }
    
    public void userModify(String userID)
    {
        List<String> userList = new ArrayList<String>(); ; //list for storing all data
        String[] userArrayModify = {}; //count which line is the user account
        int count = -1;
        try 
        {
            userList = Files.readAllLines(Paths.get("User.txt"), Charset.defaultCharset()); //store all data into list
        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }
        
        try 
        {
            Scanner myReader = new Scanner(file);
            do
            {
                userArrayModify = myReader.nextLine().split("\\|"); 
                count += 1;
                if(userArrayModify[0].equals(userID))
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
        
        userList.remove(count); //remove the old record
        
        String[] arr = userList.toArray(new String[userList.size()]); //convert list into array
        arr[0].split(",");
        
        try 
        {
            FileWriter myWriter = new FileWriter(file);
            for ( int i=0; i<arr.length;i++)
            {
                myWriter.write(arr[i] + "\n");
            }
            myWriter.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    public void AdminUserModify(String adminID)
    {
        String newline = "";
        String [] userArr = new String[0];
        
        
        //////To take out all data from the txt file
        try {
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine())
            {
                userArr = Arrays.copyOf(userArr, userArr.length + 1);
                userArr[userArr.length - 1] = myReader.nextLine();
                
            }
            myReader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Empty the txtFile
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
        
        for (int i = 0; i < userArr.length; i ++)
        {
            String [] list = userArr[i].split("\\|");
            if(list[0].equals(this.userID))
            {
                list[1] = this.Name;
                list[2] = this.Password;
                list[3] = this.Gender;
                list[4] = this.PhoneNo;
                list[5] = this.Email;
                list[6] = this.Address;
                list[7] = this.IC;
                list[8] = this.State;
                list[9] = this.Country;
                list[10] = this.VacStatus.toString();
            }
            userArr[i] = String.join("|", list);
            
        }
        
        try {
            fw = new FileWriter(file,true);
            for (int i = 0; i < userArr.length;i++)
            {
                if(i != 0)
                {
                   newline = "\n";
                }
                fw.write(newline + userArr[i]);
                
            }
            
            fw.close();
            /////TRACKING RECORD/////
        ArrayList<AModifyUserTracking> MTrackArr= new ArrayList<>();
        CurrentDateTime cdt = new CurrentDateTime();
        AModifyUserTracking MTrack = new 
                 AModifyUserTracking("",adminID,this.userID,ActionType.Modify,TargetType.User,cdt.currentDate(),cdt.currentTime(),"");
         MTrackArr = MTrack.FileRead();
         String trackingID = MTrack.setTrackingIDAuto(MTrackArr.size());
         MTrack.setTrackingID(trackingID);
         /////////////////////////////////////////////////
         
          //////////////////Writing Tracking record/////////////////////////
            String remark = JOptionPane.showInputDialog("Please insert your remark here admin");
            MTrack.setRemark(remark);
            MTrackArr.add(MTrack);
            MTrack.FileWrite(MTrackArr);
            ////////////////////////////////////////////
            JOptionPane.showMessageDialog(null, "Modified Succesful!!!");
        } catch (IOException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void userDoneVaccine(String newDose)
    {
        String [] Arr = this.returnFileLine();
        this.fileCleaning();
        this.VacStatus = UVacStatus.valueOf(newDose);
        this.changingUserVacStatus(Arr);
        
    }
    
     private String[] returnFileLine()
    {
        String [] Arr = new String[0];
        
        
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
    private void fileCleaning()
    {
        
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
    
    private void changingUserVacStatus(String[] Arr)
    {
        
        
        for (int i = 0; i < Arr.length; i ++)
        {
            
            String [] list = Arr[i].split("\\|");
            if(list[0].equals(this.userID))
            {
                
                list[10] = this.VacStatus.toString();
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

    String getstate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean userModifyProfile()
    {
        String VaccineStatus = UVacStatus.NoDose.toString();
        
        if (validation.confirmPassword(this.Password, this.confirmPassword))
        {
            if(validation.passwordValid(this.Password))
            {
                if (validation.phoneValid(this.PhoneNo))
                {
                    if (validation.emailValid(this.Email))
                    {
                        if (validation.icValid(this.IC))
                        {
                            try 
                            {
                                FileWriter userFileWriter = new FileWriter(file,true);
                                PrintWriter userPrintWriter = new PrintWriter(userFileWriter);

                                int n = JOptionPane.showOptionDialog(null,
                                    "<html> UserID: "+ this.userID + "<br> Name: " + this.Name+
                                    "<br> Gender: " + this.Gender +
                                    "<br> Phone: " + this.PhoneNo + "<br> Email: " +this.Email+
                                    "<br> Address: " +this.Address + "<br> IC/Passport: " + this.IC +
                                    "<br> State: " +this.State +
                                    "<br> Country: " +this.Country + " <html>", "Comfirmation",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,null,null,null);
                                switch (n)
                                {
                                    case 0:
                                        userPrintWriter.println(this.userID +"|"+ 
                                        this.Name+"|"+
                                        this.Password+ "|" +
                                        this.Gender+ "|"+
                                        this.PhoneNo+ "|"+
                                        this.Email+ "|"+
                                        this.Address+ "|"+
                                        this.IC+ "|"+
                                        this.State+ "|"+
                                        this.Country + "|"+ VaccineStatus);

                                        JOptionPane.showMessageDialog(null, "Successfully Modified!");
                                        pass = true;
                                        break;
                                    case 1:
                                    break;
                                }
                                userFileWriter.close();
                                userPrintWriter.close();
                                return pass;
                            }
                            catch (IOException e) 
                            {
                                JOptionPane.showMessageDialog(null,"An error occurred.");
                                e.printStackTrace();
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "<html> Please enter valid IC/passport! <br> "
                                    + "[format: xxxxxx-xx-xxxx] <html>");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Please enter valid email!");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please enter valid phone number!");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"<html> Please choose a stronger password!"
                        + " <br> Try a mix of letters, numbers, and symbols. "
                        + " <br< [format: Abcd123@] </html>");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"<html> Those passwords didn’t match! <br> Try again. </html>");
        }
        return pass;
    }
}

enum UVacStatus
{
    NoDose,
    FirstDose,
    SecondDose;
}
    
        

