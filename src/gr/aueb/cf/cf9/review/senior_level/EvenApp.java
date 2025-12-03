package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * This program checks if a number is even.
 *
 *
 */
public class EvenApp {

    public static void main(String[] args) {

        // Variable declaration and initialization
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean result = false;

        // Data input, validation and data binding
        System.out.println("Please enter a number: ");
        while(!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer number: ");
            scanner.nextLine();
        }
        num = scanner.nextInt();

        // Business logic -
        result = isEven(num);

        // Printing results
        System.out.println("The number is even: " + result);
    }

    /**
     * Checks if a number is even.
     * @param num the number to check
     * @return    true if the number is even, false otherwise.
     */
    public static Boolean isEven(int num) {
        return num % 2 == 0;
    }
}
