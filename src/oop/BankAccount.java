package oop;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

/**
 * Created by patrick.duff on 10/4/2018.
 */
public class BankAccount implements IRate {
    //Define variables


    //static >> belongs to the CLASS, not the object instance
    //final >> constant (often static final)

    private static final String routingNumber = "0034024";

    // Instance variables
    private String name;
    private String ssn;
    private String accountNumber;
    String accountType;
    double balance = 0;

    //Constructor definitions: unique methods:
        //1. They are used to define/setup/initialize properties of an object
        //2. Constructors are IMPLICITLY called upon instantiation
        //3. The same name as the class itself
        //4. They have no return type
    BankAccount() {
        System.out.println("New account created");
    }
    //Overloading: call same method name with different arguments
    BankAccount(String accountType) {
        System.out.println("New account: " + accountType);
    }

    BankAccount(String accountType, double initDeposit) {
        // initDeposit, accountType, Msg are all local variables
        System.out.println("New " + accountType + " created");
        System.out.println("Initial deposit: $" + initDeposit);
        String Msg = null;
        if (initDeposit < 1000) {
            Msg = "ERROR: Initial deposit must be at least $1,000";
        } else {
            Msg = "Thanks for your initial deposit of $" + initDeposit;
        }
        System.out.println(Msg);
        balance = initDeposit;
    }

    //Getters and Setters
    //Allow user to define the name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public String getSsn(){
        return ssn;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    // Interface methods

    public void setRate() {
        System.out.println("Setting Rate");
    }

    public void increaseRate() {
        System.out.println("Increasing Rate");
    }

    //Define methods
    public void deposit(double amount) {
        balance = balance + amount;
        showActivity("Deposit $" + amount);
    }

    public void  withdraw(double amount) {
        balance = balance - amount;
        showActivity("Withdrawal $" + amount);
    }

    //Private : can only be called from within the class
    private void showActivity(String activity) {
        System.out.println("Recent transaction: " + activity);
        System.out.println("Your new balance is: $" + balance);
    }

    void checkBalance() {
        System.out.println("Balance is $" + balance);
    }

    void getStatus() {

    }

    @Override
    public String toString() {
        return "[ NAME: " + name + " ROUTING #: " + routingNumber + " ACCT # " + accountNumber + ". Balance: $" + balance + "]";
    }

}
