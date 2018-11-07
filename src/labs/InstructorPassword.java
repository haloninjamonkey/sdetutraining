package labs;

import java.io.*;
import java.nio.Buffer;

/**
 * Created by patrick.duff on 11/6/2018.
 */
// Instructor example for PasswordCheckApp
public class InstructorPassword {
    public static void main(String[] args) {
        String filename = "C:\\Users\\patrick.duff\\Desktop\\SDETuniversity\\Files\\Passwords.txt";
        String[] passwords = new String[13];

        File file = new File(filename);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; i < passwords.length; i++) {
                passwords[i] = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Could not open file");
        } catch (IOException e) {
            System.out.println("Error: Could not read file");
        }
        for (String password : passwords) {
            System.out.print("****\n" + password + "\n");
            boolean hasNumber = false;
            boolean hasLetter = false;
            boolean hasSpecialChar = false;
            boolean hasInvalidChar = false;

            for (int n = 0; n < password.length(); n++) {
                // Condition 1: contains number
                if ("0123456789".contains(password.substring(n,n+1))) {
                    hasNumber = true;

                }
                // Condition 2: contains letter
                else if("abcdefghijklmnopqrstuvwxyz".contains(password.substring(n,n+1).toLowerCase())) {
                    hasLetter = true;
                }
                // Condition 3: contains special character, !@#$
                else if("!@#$%^&*()_-+=".contains(password.substring(n,n+1))) {
                    hasSpecialChar = true;
                }
                else {
                    try{ throw new InvalidCharacterException(password.substring(n,n+1));
                    } catch (InvalidCharacterException e) {e.toString();}

                }
            }

            // Test and Exception handling
            try {
                if (!hasNumber) {
                    throw new NumberCriteriaException(password);
                } else if (!hasLetter) {
                    throw new LetterCriteriaException(password);
                } else if (!hasSpecialChar) {
                    throw new SpecialCharCriteriaException(password);
                } else {
                    System.out.println("Valid Password");
                }
            }catch (NumberCriteriaException | LetterCriteriaException | SpecialCharCriteriaException e)  {
                System.out.println("Invalid Password: " );
                System.out.println(e.toString());
            }


        }

    }
}

class InvalidCharacterException extends Exception{
    String ch;
    public InvalidCharacterException(String ch) {
        this.ch=ch;
    }
    public String toString() {
        return "InvalidCharacterException: " + ch;
    }
}

class NumberCriteriaException extends Exception{
    String password;
    public NumberCriteriaException(String password) {
        this.password=password;
    }
    public String toString() {
        return "NumberCriteriaException: " + password;
    }
}

class LetterCriteriaException extends Exception{
    String password;
    public LetterCriteriaException(String password) {
        this.password=password;
    }
    public String toString() {
        return "LetterCriteriaException: " + password;
    }
}

class SpecialCharCriteriaException extends Exception{
    String password;
    public SpecialCharCriteriaException(String password) {
        this.password=password;
    }
    public String toString() {
        return "SpecialCharCriteriaException: " + password;
    }
}
