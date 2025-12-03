package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Find the maximum value of an integer array.
 */
public class ArrayMax {

    public static void main(String[] args) {

        // Variable declaration and initialization
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 5;
        int[] numbers = new int[SIZE];
        int maxPosition = 0;
        int maxValue = 0;

        // Data input, validation, data binding
        System.out.println("Please enter five integers: ");
        for (int i = 0; i < numbers.length; i++) {

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer: ");
                scanner.next();
            }
            numbers[i] = scanner.nextInt();
        }

        // Delegation - calling services
        maxPosition = findMaxPosition(numbers);
        maxValue = numbers[maxPosition];

        // Printing results
        System.out.printf("The maximum value is %d at position %d.\n", maxValue, (maxPosition+1));
    }

    /**
     * Find the position of the maximum value in an array.
     * @param arr the input array.
     * @return    the position of the maximum value.
     */
    public static int findMaxPosition(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;

    }
}
