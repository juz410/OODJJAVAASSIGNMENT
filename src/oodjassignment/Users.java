/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;
import java.io.File;

import java.io.FileNotFoundException;

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
    private char Gender;
    
    public Users(){}
    public Users(String UID, String P, String N) //Constructor for admin 
    {
        this.userID = UID;
        this.Password = P;
        this.Name = N;
    }
    
    public Users(String UID, String P, String N,char G, String IC, String pNo, String Email, String Ad, String state,String count, String VacSta)//Constructor for normal user
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
        
    public void adminLogin()
    {
        Boolean access = false;
        try {
            File file = new File("User.txt");
            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine())
            {
                
                String line = myReader.nextLine(); //File reading line by line
                String [] userArray = line.split(","); //Splitting the line into different index using String[] Array
                if(userArray[0].equals(this.userID) && userArray[1].equals(this.Password))
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
    
        
}
