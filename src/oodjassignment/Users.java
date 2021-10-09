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

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Users {
    private String userID, Password,Name,IC,PhoneNo,Email,Address,State,Country,VacStatus;
    private String confirmPassword;
    private String Gender;
    private Validation validation = new Validation();
    
    public Users(){}
    public Users(String UID, String P, String N) //Constructor for admin 
    {
        this.userID = UID;
        this.Password = P;
        this.Name = N;
    }
    
    public Users(String UID, String P, String N,String G, String IC, String pNo, String Email, String Ad, String state,String count, String VacSta)//Constructor for normal user
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
        this.VacStatus = VacSta;
    }
    
    public void setUserID(String UID)
    {
        this.userID = UID;
    }
    public String getUserID()
    {
        return this.userID;
    }
    public void setPassword(String P)
    {
        this.Password = P;
    }
    public String getPassword()
    {
        return this.Password;
    }
//    private String userID, Password,Name,IC,PhoneNo,Email,Address,State,Country,VacStatus;
//    private char Gender;
    public void setName(String N)
    {
        this.Name = N;
    }
    public String getName()
    {
        return this.Name;
    }
    public void setGender(String G)
    {
        this.Gender = G;
    }
    public String getGender()
    {
        return this.Gender;
    }
    public void setIC(String IC)
    {
        this.IC = IC;
    }
    public String getIC()
    {
        return this.IC;
    }
    public void setPhoneNo(String PN)
    {
        this.PhoneNo = PN;
    }
    public String getPhoneNo()
    {
        return this.PhoneNo;
    }
    public void setEmail(String E)
    {
        this.Email = E;
    }
    public String getEmail()
    {
        return this.Email;
    }
    public void setAddress(String Add)
    {
        this.Address = Add;
    }
    public String getAddress()
    {
        return this.Address;
    }
    public void setState(String S)
    {
        this.State = S;
    }
    public String getState()
    {
        return this.State;
    }
    public void setCountry(String C)
    {
        this.Country = C;
    }
    public String getCountry()
    {
        return this.Country;
    }
    public void setVacStatus(String VS)
    {
        this.VacStatus = VS;
    }
    public String getVacStatus()
    {
        return this.VacStatus;
    }
    
    public void setCPassword(String CP)
    {
        this.confirmPassword = CP;
    }
    public String getCPassword()
    {
        return this.confirmPassword;
    }
    public void adminLogin()
    {
        Boolean access = false;
        try {
            File file = new File("User.txt");
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine())
            {
                
                String line = myReader.nextLine(); //File reading line by line
                
                String [] userArray = line.split("\\|"); //Splitting the line into different index using String[] Array
                
                if(userArray[0].equals(this.userID) && userArray[2].equals(this.Password))
                {
                    
                    access = true;
                    AdminMainPage adm  =new AdminMainPage();
                    adm.setVisible(true);
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
        
    }
    
    private boolean Succesful = false;
    public boolean Succesful(){
        return this.Succesful;
    }
     
    
    public void userLogin()
    {
        Boolean access = false;
        try {
            File file = new File("User.txt");
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
        
    }
    public void userRegister()
    {
        boolean exist = false;
        File file = new File("User.txt");
        try {
            BufferedReader userExistCheck = new BufferedReader(new FileReader(file));
            String readline;
            String [] userArray;
            try {
                while((readline = userExistCheck.readLine())!= null)
                {
                    userArray = readline.split("\\|");
                    if(this.userID.equals(userArray[0]) )
                    {
                        exist = true;
                        break;
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String VaccineStatus = "null";
        
        if (exist == false)
        {
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
                                        FileWriter userFileWriter = new FileWriter("User.txt",true);
                                        PrintWriter userPrintWriter = new PrintWriter(userFileWriter);
                                        userPrintWriter.println(this.userID + "|" +
                                                this.Name+"|"+
                                                this.Password+ "|" +
                                                this.Gender+ "|"+
                                                this.PhoneNo+ "|"+
                                                this.Email+ "|"+
                                                this.Address+ "|"+
                                                this.IC+ "|"+
                                                this.State+ "|"+
                                                this.Country + "|"+ VaccineStatus);
                                        userFileWriter.close();
                                        JOptionPane.showMessageDialog(null,"Register Successfully");
                                        Succesful = true;
                                    } 
                                    catch (IOException e) 
                                    {
                                        JOptionPane.showMessageDialog(null,"An error occurred.");
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
        }else
        {
            JOptionPane.showMessageDialog(null,"User ID Already Exist Please insert a NEW User ID","Duplicated ID",JOptionPane.WARNING_MESSAGE);
        }
        
    
        
    }
}
    
        

