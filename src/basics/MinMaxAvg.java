package basics;

/**
 * Created by patrick.duff on 10/1/2018.
 */
public class MinMaxAvg {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println("Min: " + min(nums));
        System.out.println("Max: " + max(nums));
        System.out.println("Avg: " + avg(nums));
    }

    public static int min(int[] n){
        int y = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] < y) {
                y = n[i];
            }
        }
        return y;
    }

    public static int max(int[] n){
        int y = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] > y) {
                y = n[i];
            }
        }
        return y;
    }

    public static int avg(int[] n) {
        int y = 0;
        for (int i = 0; i < n.length; i++) {
            y = y + n[i];
        }
        int x = y / n.length;
        return x;
    }
}

//Instructor example

//    public static int findMax(int[] arr) {
//        int max = arr[0];
//        for (i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//
//    public static int findMin(int[] arr) {
//        int min = arr[0];
//        for (i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        return min;
//    }
//
//    public static int findAvg(int[] arr) {
//        int sum = 0;
//        for (i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//        return sum / arr.length;
//    }