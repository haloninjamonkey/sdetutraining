package basics;

/**
 * Created by patrick.duff on 10/1/2018.
 */
public class FibonacciApp {

    public static void main(String[] args) {
        //Fibonacci numbers are defined by the sum of the previous 2 numbers
        //fib(0) = 0
        //fib(1) = 1
        //fib(2) = fib(1) + fib(0) = 0 + 1 = 1
        System.out.println(fib(6));
    }

    public static int fib(int n) {

        if (n == 0) {
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        return (fib(n-1) + fib(n-2));

    }
}
