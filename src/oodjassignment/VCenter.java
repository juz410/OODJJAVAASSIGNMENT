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
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class VCenter extends Vaccines {
    private String CenterID;
    private String State;
    private String Address;
    
    public VCenter(){}
    
    
    
    public VCenter(String CID, String State, String ADD)
    {
        this.CenterID = CID;
        this.State = State;
        this.Address = ADD; 
        
    }
    public VCenter(String CID)
    {
        this.CenterID = CID;
        
    }
    
    public void setCenterID(String CID)
    {
        this.CenterID  = CID;
    }
    public String getCenterID()
    {
        return this.CenterID;
    }
    public void setState(String State)
    {
        this.State = State;
    }
    public String getState()
    {
        return this.State;
    }
    public void setAddress(String ADD)
    {
        this.Address = ADD;
    }
    public String getAddress()
    {
        return this.Address;
    }
   
    
    public void AddVaccine() //Adding vaccine to specific center, vaccines get from vaccine werehouse
    {
        String previousStats = VStatus.Available.toString();
        this.VacStatus = VStatus.InStock;
        this.VCenterID = this.CenterID;
        int availableQuantity = this.calVacQuantity(this.VacType);
        
        if(availableQuantity - this.requestedQuantity >= 0)
        {
            
            String[] vacArr = this.returnFileLine();
            this.fileCleaning();
            this.changingData(vacArr, this.requestedQuantity);
        }else
        {
            JOptionPane.showMessageDialog(null, "You have choose more vaccines than available in werehouse","OUTNUMBERED",JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
     
    public int calCenterVacQuantity(VType type,String CID) //calculate the quantity of specific center that are in stock
    {
        int VacQuantity = 0;
        File file = new File("Vaccines.txt");
        try {
            Scanner myReader = new Scanner(file);
            while(myReader.hasNext())
            {
                String[] list = myReader.nextLine().split("\\|");
                if(list[1].equals(type.toString()) && list[2].equals(VStatus.InStock.toString()) && list[3].equals(CID))
                {
                    VacQuantity ++;
                }
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Vaccines.class.getName()).log(Level.SEVERE, null, ex);
        }
        return VacQuantity;
    }
    
    @Override
    protected int calVacQuantity(VType type) //to Return the specifc vaccines quantity available in the Werehouse
    {
        int VacQuantity = 0;
        File file = new File("Vaccines.txt");
        try {
            Scanner myReader = new Scanner(file);
            while(myReader.hasNext())
            {
                String[] list = myReader.nextLine().split("\\|");
                if(list[1].equals(type.toString()) && list[2].equals(VStatus.Available.toString()))
                {
                    VacQuantity ++;
                }
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Vaccines.class.getName()).log(Level.SEVERE, null, ex);
        }
        return VacQuantity;
    }
    
    private String[] returnFileLine()
    {
        String [] Arr = new String[0];
        File file = new File("Vaccines.txt");
        
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
        File file = new File("Vaccines.txt");
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
    
    private void changingData(String [] Arr, int Quantity)
    {
        String newline = "";
        File file = new File("Vaccines.txt");
        
        
        int count = 0;
        for (int i = 0; i < Arr.length; i ++)
        {
            
            
            String [] list = Arr[i].split("\\|");
            
            {
                if(list[1].equals(this.VacType.toString()) && list[2].equals(VStatus.Available.toString()) && count < Quantity)
                {

                    
                    list[2] = this.VacStatus.toString();
                    list[3] = this.VCenterID;
                    
                    count ++;
                    
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
            JOptionPane.showMessageDialog(null,  "Succesfully insert " + Quantity + "of " + this.VacType.toString());
        } catch (IOException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
}
//////for easy use 
//        String newline = "";
//        String [] userArr = new String[0];
//        File file = new File("User.txt");
//        
//        //////To take out all data from the txt file
//        try {
//            Scanner myReader = new Scanner(file);
//            while(myReader.hasNextLine())
//            {
//                userArr = Arrays.copyOf(userArr, userArr.length + 1);
//                userArr[userArr.length - 1] = myReader.nextLine();
//                
//            }
//            myReader.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        //Empty the txtFile
//         FileWriter fw;
//        try {
//            fw = new FileWriter(file,false);
//            PrintWriter pw = new PrintWriter(fw,false);
//            pw.flush();
//            pw.close();
//            fw.close();
//            
//        } catch (IOException ex) {
//            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        
//        for (int i = 0; i < userArr.length; i ++)
//        {
//            String [] list = userArr[i].split("\\|");
//            if(list[0].equals(this.userID))
//            {
//                list[1] = this.Name;
//                list[2] = this.Password;
//                list[3] = this.Gender;
//                list[4] = this.PhoneNo;
//                list[5] = this.Email;
//                list[6] = this.Address;
//                list[7] = this.IC;
//                list[8] = this.State;
//                list[9] = this.Country;
//                list[10] = this.VacStatus;
//            }
//            userArr[i] = String.join("|", list);
//            
//        }
//        
//        
//        
//        
//        try {
//            fw = new FileWriter(file,true);
//            for (int i = 0; i < userArr.length;i++)
//            {
//                if(i != 0)
//                {
//                   newline = "\n";
//                }
//                fw.write(newline + userArr[i]);
//                
//            }
//            
//            fw.close();
//            JOptionPane.showMessageDialog(null, "Modified Succesful!!!");
//        } catch (IOException ex) {
//            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
//        }





