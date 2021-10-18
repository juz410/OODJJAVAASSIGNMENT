/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author User
 */
public class Vaccines {
    protected String VacID;
    protected VStatus VacStatus;
    protected VType VacType;
    protected String VCenterID;
    protected int requestedQuantity;
    
    
    
    public Vaccines(){}
    
    public Vaccines (String VID,VType VT,VStatus VS)
    {
        this.VacID = VID;
        this.VacType = VT;
        this.VacStatus = VS;
    }
    public Vaccines (String VID)
    {
        this.VacID = VID;
    }
    
    public void setVaccineID(String VID)
    {
        this.VacID = VID;
    }
    public String getVaccineID()
    {
        return this.VacID;
    }
    public void setVacType(VType VT)
    {
        this.VacType = VT;
    }
    
    public String getVacType()
    {
        return this.VacType.toString();
    }
    public void setVacStatus(VStatus VS)
    {
        this.VacStatus = VS;
    }
    public String getVacStatus()
    {
        return this.VacStatus.toString();
       
    }
    public void setVCenterID(String CID)
    {
        this.VCenterID = CID;
    }
    public String getVCenterID()
    {
        return this.VCenterID;
    }
    public void setRequestQuantity(int RQ)
    {
        this.requestedQuantity = RQ;
    }
    public int getRequestQuantity()
    {
        return this.requestedQuantity;
    }
    
    
    public void VaccineInsertion() //Inserting new vaccine to the warehouse
    {
        
        this.VCenterID = "NULL";
        this.VacStatus = VStatus.Available;
        
        for( int i = 0 ; i < this.requestedQuantity; i ++)
        {
            int VacQuantity = calVacQuantity(this.VacType) + 1;
            String [] firstWord = this.VacType.toString().split("");
            this.VacID = firstWord[0] + String.format("%04d", VacQuantity);
            File file = new File("Vaccines.txt");
            try {
                FileWriter fw = new FileWriter(file,true);
                PrintWriter pw = new PrintWriter(fw,true);
                pw.println(this.VacID+"|"
                +this.VacType.toString()+"|"
                +this.VacStatus +"|"
                +this.VCenterID);
                pw.flush();
                pw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Vaccines.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
    } 
    protected int calVacQuantity(VType type) //to Return the specifc vaccines quantity 
    {
        int VacQuantity = 0;
        File file = new File("Vaccines.txt");
        try {
            Scanner myReader = new Scanner(file);
            while(myReader.hasNext())
            {
                String[] list = myReader.nextLine().split("\\|");
                if(list[1].equals(type.toString()))
                {
                    VacQuantity ++;
                }
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Vaccines.class.getName()).log(Level.SEVERE, null, ex);
        }
        return VacQuantity;
    }
    
    public String[] VaccineViewAll()  //Returning all vaccine to the tblVaccine in AdminVaccinePage
    {
        File file = new File("Vaccines.txt");
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

   
    

enum VStatus
{
Available,
InStock,
Booked,
Used;
}

enum VType 
{
    Phizer,
    AstraZeneca,
    Sinovac;
    
}
enum VCenterID
{
    
}

