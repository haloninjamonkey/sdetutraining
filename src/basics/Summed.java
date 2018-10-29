package basics;

/**
 * Created by patrick.duff on 10/1/2018.
 */
public class Summed {
    public static void main(String[] args) {
        System.out.println(summed(10));
    }

    public static int summed(int n) {
        int i = (n - 1);
        while (i > 0) {
            System.out.print(n + " + " + i);
            n = n + i;
            i--;
            System.out.println(" = " + n);
        }
        return n;
    }
}

//Instructor examples below

//    public static int sum(int[] numbers) {
//        int sum=0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum=sum+numbers[i];
//        }
//        return sum;
//    }