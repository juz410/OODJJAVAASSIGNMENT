/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class AModifyUserTracking extends ModifyTrackingAbstract {
    private File file = new File("AModifyUserTracking.txt");
    
    public AModifyUserTracking(){}
    public AModifyUserTracking(String TID, String AID, String TarID, ActionType AType, TargetType TType, String Date, String Time, String Remark)
    {
        this.trackingID = TID; this.adminID = AID; this.targetID = TarID; this.AType = AType ; this.TType = TType; this.Date = Date;
        this.Time = Time; this.Remark = Remark;
    }
    
    @Override
    public String toString()
    {
        return this.trackingID + "|" + this.adminID +"|" + this.targetID + "|" +
                this.AType +"|" + this.TType +"|" + this.Date +"|"+ this.Time+"|" +this.Remark;
    }
    
    public String setTrackingIDAuto(int count)
    {
        count += 1;
        String trackingID = "UT"+ String.format("%04d", count);
        return trackingID;
    }
    
    
    public void FileWrite( ArrayList<AModifyUserTracking> TrackArr)
    {
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(file);
            ObjectOutputStream filewrite = new ObjectOutputStream(fos);
            for (int i = 0 ; i < TrackArr.size(); i ++)
            {
                filewrite.writeObject(TrackArr.get(i));
            }
            filewrite.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AModifyUserTracking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AModifyUserTracking.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public ArrayList<AModifyUserTracking> FileRead()
    {
        ArrayList<AModifyUserTracking> TrackArr = new ArrayList<AModifyUserTracking>();
        FileInputStream fis;
        try {
            fis = new FileInputStream(file);
            ObjectInputStream fileread = new ObjectInputStream(fis);
        
            AModifyUserTracking temp = new AModifyUserTracking();
            while(true)
            {
                try{
                        temp = (AModifyUserTracking)fileread.readObject();
                    }catch(EOFException e)
                    {
                        break;
                    } catch (ClassNotFoundException ex) {
                    
                }
                if(temp != null)
                {
                    TrackArr.add(temp);
                }else
                {
                    break;
                }

            }
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
        
        return TrackArr;
    }
}
