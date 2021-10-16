/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

/**
 *
 * @author User
 */
public class VCenter {
    private String CenterID;
    private String State;
    private String Address;
    private String VaccineID;
    
    public VCenter(){}
    
    public VCenter(String CID, String State, String ADD,String VID)
    {
        this.CenterID = CID;
        this.State = State;
        this.Address = ADD;
        this.VaccineID = VID;
        
    }
    
    public VCenter(String CID, String State, String ADD)
    {
        this.CenterID = CID;
        this.State = State;
        this.Address = ADD; 
        
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
    public void setVaccineID(String VID)
    {
        this.VaccineID = VID;
   
    }
    public String getVaccineID()
    {
        return this.VaccineID;
    }
    
}




