package basics;

import java.net.SocketPermission;

/**
 * Created by patrick.duff on 9/21/2018.
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        // Creating a variable to define career

        //Declare a variable
        String career;
        System.out.println("Program is starting");

        //Define a variable
        career = "Software Developer";
        System.out.println("My career is: " + career);

        //Declare and Define
        int hoursPerWeek = 40;
        int weeksPerYear = 50;
        double rate = 42.50;

        //Compute annual salary
        //rate * hoursPerWeek * weeksPerYear

        double salary = hoursPerWeek * weeksPerYear * rate;
        System.out.println("My salary as a " + career + "at the rate of $" + rate + " per hour is $" + salary + " per year.");

    }
}
