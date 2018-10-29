package oop;

/**
 * Created by patrick.duff on 10/12/2018.
 */
public class LoanAccount implements IRate, ITry{

    @Override
    public void setRate() {

    }

    @Override
    public void increaseRate() {

    }

    public void setTerm(int term) {
        System.out.println("Setting term to " + term + " years.");
    }

    public void setAmortSchedule() {
        System.out.println("Amortization schedule");
    }

    @Override
    public void tryThis() {
        System.out.println("This works?");
    }
}
