package labs;

import java.io.*;

/**
 * Created by patrick.duff on 11/1/2018.
 */
public class PhoneNumberApp {
    public static void main(String[] args) {
        // This will read a text file and retrieve a valid phone number

        String filename = "C:\\Users\\patrick.duff\\Desktop\\SDETuniversity\\Files\\PhoneNumber.txt";
        File file = new File(filename);
        String[] phoneNums = new String[5];
        String phoneNum = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            for (int i = 0; i < phoneNums.length; i++) {
                phoneNums[i] = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ERROR: Could not read file");
            e.printStackTrace();
        }
        // Valid phone number:
        // 10 digits long
        // Area code can't start with 0 or 9
        // there can not be 911
        for (int i = 0; i < phoneNums.length; i++){
            phoneNum = phoneNums[i];
            try {

                if (phoneNum.length() != 10 && !phoneNum.equals("911")) {
                    throw new TenDigitException(phoneNum);
                }
                if ((phoneNum.substring(0, 1).equals("0")) || ((phoneNum.substring(0).equals("9")))) {
                    throw new AreaCodeException(phoneNum);
                }
                for (int n=0; n<phoneNum.length()-2; n++) {
                    if (phoneNum.substring(n, (n+1)).equals("9")){
                        if (phoneNum.substring(n+1, n+3).equals("11")){
                            throw new EmergencyException(phoneNum);
                        }
                    }
                }
                System.out.println(phoneNum);
            } catch (TenDigitException e) {
                System.out.println("ERROR: Phone number is not 10 digits");
                System.out.println(e.toString());
            } catch (AreaCodeException e) {
                System.out.println("ERROR: Phone number has invalid area code");
                System.out.println(e.toString());
            } catch (EmergencyException e) {
                System.out.println("ERROR: Invalid 911 sequence found");
                System.out.println(e.toString());
            }
        }


    }
}

class TenDigitException extends Exception {
    String num;
    TenDigitException(String num) {
        this.num = num;
    }
    public String toString() {
        return ("TenDigitException: " + num);
    }

}

class AreaCodeException extends Exception {
    String num;
    AreaCodeException(String num) {
        this.num = num;
    }
    public String toString() {
        return ("AreaCodeException: " + num);
    }

}

class EmergencyException extends Exception {
    String num;
    EmergencyException(String num) {
        this.num = num;
    }
    public String toString() {
        return ("EmergencyException: " + num);
    }
}