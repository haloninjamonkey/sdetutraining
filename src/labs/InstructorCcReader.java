package labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by patrick.duff on 11/14/2018.
 */
public class InstructorCcReader {

    public static void main(String[] args) {
        List<String[]> transactions = new ArrayList<>();
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
                transactions.add(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File Not Found: " + filename);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ERROR: could not read the data: " + filename);
            e.printStackTrace();
        }
        System.out.println("DATE | TRANSACTION | VENDOR | AMOUNT | BALANCE");
        for (String[] transaction : transactions) {
            String date = transaction[0];
            String type = transaction[1];
            String vendor = transaction[2];
            double amount = Double.parseDouble(transaction[3]);
            System.out.print(date + " | " + type + " | " + vendor + " | $" + amount);

            if (type.equalsIgnoreCase("credit")) {
                // System.out.println("Add to balance");
                balance = balance + amount;
            }
            else if (type.equalsIgnoreCase("debit")) {
                // System.out.println("Subtract from balance");
                balance = balance - amount;
            }
            else {
                // System.out.println("Some other transaction");
            }
            System.out.print(" | New balance is: $" + df2.format(balance) + "\n");
        }

        // Check the balance
        if (balance > 0) {
            System.out.println("You have a balance of: " + df2.format(balance));
            System.out.println("You are charged a 10% fee of: " + df2.format(balance * .10));
            System.out.println("Your new balance is: " + df2.format(balance * 1.1));
        }
        else if (balance < 0) {
            System.out.println("Thank you for your payments.");
            System.out.println("You have an overpayment of: -" + df2.format(balance));
        }
        else {
            System.out.println("Thank you for your payment!");
        }

    }
}