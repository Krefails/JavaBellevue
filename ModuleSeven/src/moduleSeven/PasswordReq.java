package moduleSeven;

import java.util.regex.*;
import java.util.Scanner;

/**
 *
 * @author Justin Kreifels
 * @date 02-15-2022
 */
public class PasswordReq {
    
    /**
     * isPasswordValid uses REGEX to check for if a string meets requirements
     * @param pass String
     * @return match.matches() boolean
     */
    public static boolean isPasswordValid(String pass) {
        
        //The regex string checks for at least one digit, one lower case, one upper case, and if it's between 8 to 20 characters
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$";

        Pattern patt = Pattern.compile(regex);

        //If the String is empty it will return false
        if (pass == null) {
            return false;
        }

        Matcher match = patt.matcher(pass);

        return match.matches();

    }

    /**
     * The driver method for PasswordReg
     * This method takes in user input and run isPasswordValid to compare the String pass with REGEX
     * @param args String[]
     * @return void
     */
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        String pass = "";

        System.out.print("A strong password follows the requirements listed below:\n"
         + "Must be longer the 8 characters,\nMust contain at least one lower case, upper case, and digit!"
         + "\nPlease input a password:  ");
        pass = input.nextLine();

        System.out.printf("Is your password strong? %b", isPasswordValid(pass));

        input.close();

    }

}
