package basics;

/**
 * Created by patrick.duff on 9/27/2018.
 */
public class NumbersCalc {

    public static void main(String[] args) {
        printName();
        int numA = 10;
        int numB = 20;
        addNumbers(numA, numB);
        System.out.println(multiplyNumbers(numA, numB));
    }

    static void printName() {
        System.out.println("My name is Patrick");
    }

    static void addNumbers(int numberA, int numberB) {
        //this function will add two numbers
        int sum = numberA + numberB;
        System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
    }

    static int multiplyNumbers(int valueA, int valueB) {
        int product = valueA * valueB;
        addNumbers(product, product);
        return product;
    }


}
