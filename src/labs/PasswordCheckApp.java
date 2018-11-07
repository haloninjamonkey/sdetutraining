package labs;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by patrick.duff on 11/2/2018.
 */
public class PasswordCheckApp {
    public static void main(String[] args) {
        String filename = "C:\\Users\\patrick.duff\\Desktop\\SDETuniversity\\Files\\Passwords.txt";
        File file = new File(filename);
        String[] passwords = new String[13];
        String password = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; i < passwords.length; i++) {
                passwords[i] = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ERROR: Could not read file");
            e.printStackTrace();
        }

        for (int i = 0; i < passwords.length; i++){
            password = passwords[i];
            Pattern letter = Pattern.compile("[a-zA-z]");
            Pattern digit = Pattern.compile("[0-9]");
            Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");

            Matcher hasLetter = letter.matcher(password);
            Matcher hasDigit = digit.matcher(password);
            Matcher hasSpecial = special.matcher(password);

            try {

                if (!hasLetter.find()){
                    throw new NoLetterException(password);
                }
                if (!hasDigit.find()){
                    throw new NoNumberException(password);
                }
                if(!hasSpecial.find()) {
                    throw new NoSpecialCharacterException(password);
                } else {
                    System.out.println(password);
                }
            } catch (NoLetterException e) {
                System.out.println("ERROR: No letters in password");
                System.out.println(e.toString());
            } catch (NoNumberException e) {
                System.out.println("ERROR: No numbers in password");
                System.out.println(e.toString());
            } catch (NoSpecialCharacterException e) {
                System.out.println("ERROR: No Special characters in password");
                System.out.println(e.toString());
            }
        }
    }
}

class NoLetterException extends Exception {
    String pass;
    NoLetterException(String pass) {
        this.pass = pass;
    }
    public String toString() {
        return ("NoLetterException: " + pass);
    }
}

class NoNumberException extends Exception {
    String pass;
    NoNumberException(String pass) {
        this.pass = pass;
    }
    public String toString() {
        return ("NoNumberException: " + pass);
    }
}

class NoSpecialCharacterException extends Exception {
    String pass;
    NoSpecialCharacterException(String pass) {
        this.pass = pass;
    }
    public String toString() {
        return ("NoSpecialCharacterException: " + pass);
    }
}
