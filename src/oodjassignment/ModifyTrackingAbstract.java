/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

import java.io.*;

 public abstract class ModifyTrackingAbstract implements java.io.Serializable {
    
    protected ActionType AType;
    protected TargetType TType;
    protected String trackingID,adminID,targetID,Date,Time,Remark;
    
    public abstract String toString();
    
    
    public ModifyTrackingAbstract(){};
    
    public void setTrackingID(String TID){this.trackingID = TID;} public String getTrackingID(){return this.trackingID;}
    public void setAdminID(String AID){this.adminID = AID;}  public String getAdminID(){return this.adminID;}
    public void setTargetID(String TID){this.targetID = TID;} public String getTargetID(){return this.targetID;}
    public void setDate(String date){this.Date = date;} public String getDate(){return this.Date;}
    public void setTime(String time){this.Time = time;} public String getTime(){return this.Time;}
    public void setRemark(String remark){this.Remark = remark;} public String getRemark(){return this.Remark;}
    public void setActionType(ActionType AType){this.AType = AType;} public ActionType getActionType(){return this.AType;}
    public void setTargetType(TargetType TType){this.TType = TType;} public TargetType getTargetType(){return this.TType;}
   
        
            
    
}

enum ActionType
{
    Approve,
    Reject,
    Modify,
    Add,
    CompleteApp,
    Remove;
}

enum TargetType
{
    Appointment,
    VCenter,
    User;
}
