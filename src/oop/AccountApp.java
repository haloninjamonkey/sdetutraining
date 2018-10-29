package oop;

/**
 * Created by patrick.duff on 10/12/2018.
 */
public class AccountApp {

    public static void main(String[] args) {
        LoanAccount la = new LoanAccount();
        la.increaseRate();
        la.setRate();
        la.setAmortSchedule();
        la.setTerm(20);
        la.tryThis();


        //Polymorphism changes where we are pointing
        IRate account1 = new LoanAccount();
        account1.increaseRate();
        account1.setRate();

        ITry account2 = new LoanAccount();
        account2.tryThis();

    }

}
