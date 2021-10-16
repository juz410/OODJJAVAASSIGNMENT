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
public class Vaccines {
    private String VacID;
    private VStatus VacStatus;
    private VType VacType;
    
    public Vaccines(){}
    
    public Vaccines (String VID,VType VT,VStatus VS)
    {
        this.VacID = VID;
        this.VacType = VT;
        this.VacStatus = VS;
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
