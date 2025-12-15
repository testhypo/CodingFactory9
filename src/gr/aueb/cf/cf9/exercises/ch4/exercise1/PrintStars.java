package gr.aueb.cf.cf9.exercises.ch4.exercise1;

import java.util.Scanner;

/**
 * Exercise 1
 * User inserts the number of stars (n).
 * Program prints:
 * 1. n stars horizontally
 * 2. n stars vertically
 * 3. n x n stars
 * 4. 1 to n stars
 * 5. n to 1 stars
 */
public class PrintStars {

    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        n = scanner.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.print('*');
        }

        System.out.println('\n');
        for (int i = 0; i < n; i++) {
            System.out.println('*');
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
