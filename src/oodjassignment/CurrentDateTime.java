/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author user
 */
public class CurrentDateTime 
{
    Date currentDate = new Date();
    
    public String currentTime()
    {
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
        return timeFormat.format(currentDate);
    }
    
    public String currentDate()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(currentDate);
    }
    
    public String currentWeek()
    {
        SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
        return dayOfTheWeekFormat.format(currentDate);
    }
}
