package exceptionsfiles;

import java.util.Scanner;

/**
 * Created by patrick.duff on 10/30/2018.
 */
public class PaymentsApp {

    //Take a payment from a user
    public static void main(String[] args) {
        double payment = 0;
        boolean positivePymt = true;
        //1. Ask user for input


        do {
            //2. Get amount and test value
            //3. Handle exceptions
            System.out.print("Enter the payment amount: ");
            Scanner in = new Scanner(System.in);

            try {
                payment = in.nextDouble();
                if (payment < 0) {
                    throw new NegativePaymentException(payment);
                }
                else {
                    positivePymt = true;
                }
            } catch (NegativePaymentException e) {
                System.out.println(e.toString());
                System.out.println("Please try again");
                positivePymt = false;
            }
        } while (!positivePymt);
        System.out.println("Thank you for your payment of: " + payment);
    }
}
