package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * The user enters two values, numerator and denominator
 * and the program calculates the quotient, repeatedly
 *
 * If the numerator is 0 then the program exits
 * If the denominator is 0, then the program repeats
 */
public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please enter the numerator: ");
            numerator = scanner.nextInt();
            if (numerator == 0) {
                System.out.println("The numerator is 0. Quitting ....");
                break;
            }

            System.out.println("Please enter the denominator: ");
            denominator = scanner.nextInt();
            if (denominator == 0) {
                System.out.println("Cannot divide by zero");
                continue;
            }

            result = numerator / denominator;
            System.out.printf("%d divided by %d is: %d\n", numerator, denominator, result);

        }
    }
}
