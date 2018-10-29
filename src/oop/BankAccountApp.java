package oop;

/**
 * Created by patrick.duff on 10/4/2018.
 */
public class BankAccountApp {
    public static void main(String[] args) {
        //Creating a new bank account > instantiate an object

        BankAccount acc1 = new BankAccount("Checking account", 12000);


        //acc1.name = "Patrick Duff";
        //acc1.accountNumber = "04564807860";
        //With Encapsulation : public API methods

        acc1.setName("Patrick Duff");
        System.out.println(acc1.getName());
        acc1.setSsn("789087890");
        System.out.println("SSN = " + acc1.getSsn());
        acc1.setAccountNumber("04564807860");
        System.out.println("Account Number: " + acc1.getAccountNumber());
        acc1.setRate();
        acc1.increaseRate();

        acc1.deposit(500);
        acc1.deposit(500);
        acc1.deposit(500);
        acc1.deposit(500);
        acc1.withdraw(-2000);


        //polymorphism through overriding the toString method
        System.out.println(acc1.toString());

        //Polymorphism through overloading

        BankAccount acc2 = new BankAccount("Cheking account");
        acc2.setAccountNumber("01689453");

        BankAccount acc3 = new BankAccount("Checking account", 1001);
//        acc3.checkBalance();

        //Demo for inheritance
//        CDAccount cd1 = new CDAccount();
//        cd1.balance = 3000;
//        cd1.interestRate = "4.5";
//        cd1.name = "Juan";
//        cd1.accountType = "CD Account";
//        System.out.println(cd1.toString());
//        cd1.compound();

    }
}
