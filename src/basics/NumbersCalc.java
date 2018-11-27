package basics;

import java.util.Scanner;

/**
 * Created by patrick.duff on 9/27/2018.
 */
public class NumbersCalc {

    public static void main(String[] args) {
        printName();
        int numA;
        int numB;
        System.out.println("Please enter a first number: ");
        Scanner first = new Scanner(System.in);
        numA = first.nextInt();
        System.out.println("Please enter a second number: ");
        Scanner second = new Scanner(System.in);
        numB = second.nextInt();
        addNumbers(numA, numB);
        System.out.println("If you multiply those numbers the sum is: " + multiplyNumbers(numA, numB));
    }

    static void printName() {
        String name;
        System.out.println("What is your name? ");
        Scanner in = new Scanner(System.in);
        name = in.next();
        System.out.println("Welcome " + name);
    }

    static void addNumbers(int numberA, int numberB) {
        //this function will add two numbers
        int sum = numberA + numberB;
        System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
    }

    static int multiplyNumbers(int valueA, int valueB) {
        int product = valueA * valueB;
//        addNumbers(product, product);
        return product;
    }


}
