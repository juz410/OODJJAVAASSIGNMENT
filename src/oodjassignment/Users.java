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
    private String userID, Password,Name,IC,PhoneNo,Email,Address,State,Country,VacStatus;
    private String confirmPassword;
    private String Gender;
    private File file = new File("User.txt");
    private Validation validation = new Validation();
    
    public Users(){}
    public Users(String UID, String P, String N) //Constructor for admin 
    {
        this.userID = UID;
        this.Password = P;
        this.Name = N;
    }
    
    public Users(String UID, String N, String P,String G, String IC, String pNo, String Email, String Ad, String state,String count, String VacSta)//Constructor for normal user
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
    
    public void adminRegister()
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
                    if(adminArray[0].startsWith("A"))
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
        String adminID = "A0" + String.valueOf(adminNum);
        
        if(validation.confirmPassword(this.Password, this.confirmPassword ))
        {
            try
            {
                FileWriter userFileWriter = new FileWriter("User.txt",true);
                PrintWriter userPrintWriter = new PrintWriter(userFileWriter);
                int n = JOptionPane.showOptionDialog(null,
                    "<html> UserID: "+ this.userID + "<br> Name: " + this.Name+ " <html>", "check",
                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,null,null,null);
                switch (n)
                {
                    case 0:
                        userPrintWriter.println("\n" + adminID + this.Name+"|"+ this.Password + "|" + "|" + "|" 
                            + "|" + "|" + "|" + "|" + "|");
                    case 1:
                        break;
                }
            }    
            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null,"An error occurred.");
                e.printStackTrace();
            }
        }
    }
    
    public boolean userRegister()
    {
        boolean exist = false;
        boolean pass = false;
        try 
        {
            BufferedReader userExistCheck = new BufferedReader(new FileReader(file));
            String readline;
            String [] userArray;
            try {
                while((readline = userExistCheck.readLine())!= null)
                {
                    userArray = readline.split("\\|");
                    if(this.userID.equals(userArray[0]))
                    {
                        exist = true;
                        break;
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String VaccineStatus = "null";
        
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
                            if(exist == false) //avoid userID duplicate
                            {
                                try 
                                {
                                    FileWriter userFileWriter = new FileWriter("User.txt",true);
                                    PrintWriter userPrintWriter = new PrintWriter(userFileWriter);
                                    int n = JOptionPane.showOptionDialog(null,
                                        "<html> UserID: "+ this.userID + "<br> Name: " + this.Name+
                                        "<br> Gender: " + this.Gender +
                                        "<br> Phone: " + this.PhoneNo + "<br> Email: " +this.Email+
                                        "<br> Address" +this.Address + "<br> IC/Passport: " + this.IC +
                                        "<br> State: " +this.State +
                                        "<br> Country: " +this.Country + " <html>", "Check",
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
                                            userFileWriter.close();
                                            userPrintWriter.close();

                                            JOptionPane.showMessageDialog(null, "Registration Success!");
                                            pass = true;
                                            break;
                                        case 1:
                                        break;
                                    }
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
                                JOptionPane.showMessageDialog(null,"<html> Phone Number Already Used! <br> "
                            + "Please insert a NEW Phone Number! <html>","Duplicated Phone Number",
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
                    this.VacStatus = userArray[10];
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
        List<String> userList = new ArrayList<String>(); ; //store whole data into list
        String[] userArrayModify = {}; //count which line is the user account
        int count = -1;
        try 
        {
            userList = Files.readAllLines(Paths.get("User.txt"), Charset.defaultCharset());
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
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
    public void AdminUserModify()
    {
        String newline = "";
        String [] userArr = new String[0];
        File file = new File("User.txt");
        
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
                list[10] = this.VacStatus;
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
            JOptionPane.showMessageDialog(null, "Modified Succesful!!!");
        } catch (IOException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
    
        

