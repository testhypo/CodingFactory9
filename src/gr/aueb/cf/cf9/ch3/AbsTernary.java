package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculates the absolute value of a number
 * using the ternary operator
 */
public class AbsTernary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        abs = (num >= 0) ? num : -num; 
        System.out.printf("|%d| = %d", num, abs);
    }
}
