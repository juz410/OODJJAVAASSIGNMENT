    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class Validation
{
    boolean pass ;
    Appointment appointment = new Appointment();
    
    public boolean icDuplicateValid(String ic)
    {
        File file = new File("User.txt");
        pass = true;
        try 
        {
            BufferedReader userExistCheck = new BufferedReader(new FileReader(file));
            String readline;
            String [] userArray;
            try {
                while((readline = userExistCheck.readLine())!= null)
                {
                    userArray = readline.split("\\|");
                    if(ic.equals(userArray[0]))
                    {
                        pass = false;
                        break;
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pass;
    }
    
    public boolean passwordValid(String password) 
    {   
        String passwordPattern =
                "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    public static boolean emailValid(String email)
    {
        String emailPattern = 
                "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    public boolean confirmPassword(String p1, String p2)
    {
        pass = p1.equals(p2);
        return pass;
    }
    
    public boolean phoneValid(String phone)
    {
        try
        {
            int phn = Integer.parseInt(phone);
            if( String.valueOf(phn).length() >= 7 )
            {
                pass = true;
            }
            else
            {
                pass = false;
            }
        }
        catch(NumberFormatException e)
        {
            pass = false;
        }
        return pass;
    }
    
    public boolean icValid(String ic)
    {
        String icPattern = "^\\d{6}\\-\\d{2}\\-\\d{4}";
        String passportPattern = "^(?!^0+$)[a-zA-Z0-9]{3,20}$";
        Pattern pattern1 = Pattern.compile(icPattern);
        Pattern pattern2 = Pattern.compile(passportPattern);
        Matcher matcher1 = pattern1.matcher(ic);
        Matcher matcher2 = pattern2.matcher(ic);
        if (matcher1.matches() || matcher2.matches())
        {
            pass = true;
        }
        else
        {
            pass = false;
        }
        return pass;
    }
    
    public boolean validationAdmin()
    {
        JTextField txt = new JTextField(10);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel("Please authorize yourself:"), BorderLayout.NORTH);
        panel.add(txt);
        int n = JOptionPane.showOptionDialog(null, panel, "Validation", 
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,null,null);
        switch (n)
        {
            case 0:
                String passwordValidation = txt.getText();
                {
                    if ("abc123".equals(passwordValidation))
                    {
                        pass = true;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"<html> Wrong Code!"
                        + "<br> You cannot register as admin! <html>", "WrongPasscode", JOptionPane.WARNING_MESSAGE);
                    }
                }
                break;
            case 1:
                break;
        }
        return pass;
    }
    
    public boolean validationUserModify(String userID)
    {
        Users user = new Users();
        user.userProfile(userID);
        JTextField txt = new JTextField(20);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel("Please enter your password:"), BorderLayout.NORTH);
        panel.add(txt);
        int n = JOptionPane.showOptionDialog(null, panel, "Validation", 
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,null,null);
        switch (n)
        {
            case 0:
                String passwordValidation = txt.getText();
                {
                    if (passwordValidation.equals(user.getPassword()))
                    {
                        pass = true;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Wrong Password, Try Again!", "Check", JOptionPane.WARNING_MESSAGE);
                    }
                }
                break;
            case 1:
                break;
        }
        return pass;
    }
    
    public boolean validationDate(int year, int month, int day,String check)
    {
        LocalDate userDate = LocalDate.of(year,month,day); //convert user input Date into localdate type
        LocalDate currentDate = LocalDate.now(); //current date 
        LocalDate currentDateAdd7Days =  currentDate.plusDays(7); //make a conditions that don't let user make appointment before 7 days
        if (!userDate.isBefore(currentDateAdd7Days) && "r".equals(check))
        {
            pass = true;
        }
        else if (userDate.isAfter(currentDate) && "c".equals(check))
        {
            pass = true;
        }
        return pass;
    }
    
    public boolean validationSecondDoseDate(int year, int month, int day,String userID)
    {
        appointment.firstDoseDone(userID);
        String[]userdate = appointment.getDate().split("/");
        LocalDate secondDoseDate = LocalDate.of(year, month, day);
        LocalDate userDate = LocalDate.of(Integer.valueOf(userdate[2]),Integer.valueOf(userdate[1]),Integer.valueOf(userdate[0]));
        LocalDate userDateAdd1Month = userDate.plusMonths(1);//make sure user can make 2nd dose appointment after finish 1st dose 1 month
        if (secondDoseDate.isAfter(userDateAdd1Month))
        {
            pass = true;
        }
        return pass;
    }
}
