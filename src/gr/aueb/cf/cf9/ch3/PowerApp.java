package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculate the power of a number, a^n
 * a^n = a*a*...*a (n times)
 */
public class PowerApp {

    public static void main(String[] args) {

        // Variable declaration and initiation
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        // Data entry and variable assignment
        System.out.println("Please enter base and power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        // Data processing
        while (i <= power) {
            result *= base;
            i++;
        }

        // Exporting results
        System.out.printf("%d ^ %d = %d\n", base, power, result);
    }
}
