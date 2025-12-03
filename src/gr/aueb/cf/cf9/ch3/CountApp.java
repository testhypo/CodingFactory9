package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Count the number of positive numbers
 * how many loops will be need is a decision that
 * happens at runtime
 */
public class CountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positives = 0;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        // The loop executes until a negative number is entered
        // The negative number is called a sentinel
        while (num >= 0) {
            positives++;
            System.out.println("Please enter a number: ");
            num = scanner.nextInt();
        }

        System.out.println("The count of positive number is: " + positives);
    }
}
