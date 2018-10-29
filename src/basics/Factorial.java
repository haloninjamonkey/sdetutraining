package basics;

/**
 * Created by patrick.duff on 10/1/2018.
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fact2(5));
    }
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        else if (n == 1) {
            return 1;
        }
        int i = (n - 1);
        while (i > 0) {
            n =  n * i;
            i--;
        }
        ;
        return (n);
    }

    public static int fact2(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact2(n - 1);
    }
}

// Instructor Example:

//    public static int factorial(int n) {
//        if (n == 0) {
//            return 1;
//        }
//        else if (n == 1) {
//            return 1;
//        }
//        return factorial(n-1) * n;
//    }