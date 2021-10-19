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
   
    
    public String AssignVaccine(VStatus preStats, VStatus newStat)
    {
        String previousStats = preStats.toString();
        this.VacStatus = newStat;
        this.VCenterID = this.CenterID;
        String[] vacArr = this.returnFileLine();
        this.fileCleaning();
        this.requestedQuantity = 1;
        this.changingData(vacArr, this.requestedQuantity,previousStats,this.VCenterID);
        return this.VacID;
       
    }
    
    
    public void RemoveVaccine()
    {
        String previousStats = VStatus.InStock.toString();
        this.VacStatus = VStatus.Available;
        this.VCenterID = this.CenterID;
        int availableQuantity = this.calCenterVacQuantity(this.VacType, this.CenterID);
        
        if(availableQuantity - this.requestedQuantity >= 0)
        {
            
            String[] vacArr = this.returnFileLine();
            this.fileCleaning();
            this.changingData(vacArr, this.requestedQuantity,previousStats,"NULL");
        }else
        {
            JOptionPane.showMessageDialog(null, "You have choose more vaccines than available in-stock","OUTNUMBERED",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void AddVaccine() //Adding vaccine to specific center, vaccines get from vaccine werehouse
    {
        String previousStats = VStatus.Available.toString();
       
        this.VacStatus = VStatus.InStock;
        
        this.VCenterID = this.CenterID;
        this.CenterID = "NULL"; //FOR PREVIOUS MATCHING
        int availableQuantity = this.calVacQuantity(this.VacType, previousStats);
        
        if(availableQuantity - this.requestedQuantity >= 0)
        {
            
            String[] vacArr = this.returnFileLine();
            this.fileCleaning();
            this.changingData(vacArr, this.requestedQuantity,previousStats,this.VCenterID);
        }else
        {
            JOptionPane.showMessageDialog(null, "You have choose more vaccines than available in werehouse","OUTNUMBERED",JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
     
    public static int calCenterVacQuantity(VType type,String CID) //calculate the quantity of specific center that are in stock
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
    
    
    protected int calVacQuantity(VType type, String status) //to Return the specifc vaccines quantity available in the Werehouse
    {
        int VacQuantity = 0;
        File file = new File("Vaccines.txt");
        try {
            Scanner myReader = new Scanner(file);
            while(myReader.hasNext())
            {
                String[] list = myReader.nextLine().split("\\|");
                if(list[1].equals(type.toString()) && list[2].equals(status))
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
    
    private void changingData(String [] Arr, int Quantity, String previousStats, String nCID)
    {
        
        File file = new File("Vaccines.txt");
        
        
        int count = 0;
        for (int i = 0; i < Arr.length; i ++)
        {
            
            
            String [] list = Arr[i].split("\\|");
            
            {
                if(list[1].equals(this.VacType.toString()) && list[2].equals(previousStats) && count < Quantity && list[3].equals(this.CenterID))
                {

                    
                    list[2] = this.VacStatus.toString();
                    list[3] = nCID;
                    this.VacID = list[0];
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
            if(this.VacStatus.equals(VStatus.InStock))
            {
                JOptionPane.showMessageDialog(null,  "Succesfully insert " + Quantity + " of " + this.VacType.toString());
            }else if(this.VacStatus.equals(VStatus.Available))
            {
                JOptionPane.showMessageDialog(null,  "Succesfully Remove " + Quantity + " of " + this.VacType.toString() + " from the stock");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public  static String[] showCentersAddress(String CID)
    {
        String [] AddressArr = new String[2];
        File file = new File("VCenter.txt");
        try {
            Scanner myReader = new Scanner(file);
            while(myReader.hasNext())
            {
                
                String line [] = myReader.nextLine().split("\\|");
                if (CID.equals(line[0]))
                {
                    
                    AddressArr[0] = line[1];
                    AddressArr[1] = line[2];
                    break;
                }           
            }
        
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VCenter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return AddressArr;
    }
    
    public static String[] VCenterViewAll()
    {
        File file = new File("VCenter.txt");
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
    
    
    
}





