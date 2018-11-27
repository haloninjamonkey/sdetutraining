package algorithms;

/**
 * Created by patrick.duff on 11/14/2018.
 */
public class Demo {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 100, 50, 97, 13};
        int[] sortedNumbers = {5, 9, 12, 18, 21, 26, 29, 35, 39, 45, 49, 51, 58, 59, 61, 72, 88, 91, 94};

        // Call a function that searches for a specific number
        // Call the linear search
        int pos = algorithms.Search.linearSearch(numbers, 50);
        System.out.println("Found at position: " + pos);

        // Call the binary search
        int index = algorithms.Search.binarySearch(sortedNumbers, 49, 0, sortedNumbers.length);
        System.out.println("Found at position: " + index);

        // Call the bubbleSet function

        Sort.bubbleSort(numbers);
    }
}
