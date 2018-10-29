package oop;

/**
 * Created by patrick.duff on 10/5/2018.
 */
public class CDAccount extends BankAccount implements IRate{

    String interestRate;

    void compound(){
        System.out.println("Compounding interest at " + interestRate + "%");
    }

}
