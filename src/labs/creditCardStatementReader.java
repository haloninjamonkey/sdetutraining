package labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.DecimalFormat;

/**
 * Created by patrick.duff on 11/14/2018.
 */
public class creditCardStatementReader {

    public static void main(String[] args) {
        List<String[]> data = new ArrayList<>();
        String filename = "C:\\Users\\patrick.duff\\Desktop\\SDETuniversity\\Files\\creditcards.csv";
        String dataRow;
        double balance = 0;
        DecimalFormat df2 = new DecimalFormat(".##");

        try {
            // Open the file
            BufferedReader br = new BufferedReader(new FileReader(filename));
            // Read the data as long as it's not empty
            while ((dataRow = br.readLine()) != null) {
                // Parse the data by commas
                String[] line = dataRow.split(",");
                // Add the data to the collection
                data.add(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File Not Found: " + filename);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ERROR: could not read the data: " + filename);
            e.printStackTrace();
        }

        for (String[] account : data) {
            double amount = Double.parseDouble(account[3]);
            Pattern credit = Pattern.compile("CREDIT");
            Pattern debit = Pattern.compile("DEBIT");
            Pattern fee = Pattern.compile("FEE");
            Matcher isCredit = credit.matcher(account[1]);
            Matcher isDebit = debit.matcher(account[1]);
            Matcher isFee = fee.matcher(account[1]);

            if(isCredit.find()){
                System.out.println("Charge in the amount of: " + df2.format(amount));
                balance += amount;
                System.out.println("Your new balance is: " + df2.format(balance));
            }
            if (isDebit.find()) {
                System.out.println("Payment made in the amount of: $" + df2.format(amount));
                balance -= amount;
                System.out.println("Your new balance is: $" + df2.format(balance));
            }
            if (isFee.find()){
                System.out.println("Monthly fee of: $" + df2.format(amount));
                balance += amount;
                System.out.println(balance);
            }
        }

    if (balance > 0) {
        System.out.println("Your balance is: $" + df2.format(balance) + ", You will be charged a 10% late fee.");
        balance = (balance * 1.1);
        System.out.println("Your new balance is: $" + df2.format(balance));
    }
        if (balance == 0) {
            System.out.println("Thank you for your payments!");
        }
        if (balance < 0) {
            System.out.println("You have made overpayments in the amount of: $" + df2.format(balance) + ". That amount will be credited to your account");
        }

    }
}
