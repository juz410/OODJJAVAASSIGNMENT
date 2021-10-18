    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author user
 */
public class Validation
{
    boolean pass;
    public static boolean passwordValid(String password) 
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

}
