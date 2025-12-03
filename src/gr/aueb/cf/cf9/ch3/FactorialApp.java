package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;
/**
 * Calculate factorial of a number
 * n! = 1*2*3...*n
 * e.g. 5! = 1*2*3*4*5 = 120
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 1;
        int result = 1;

        System.out.println("Factorial calculator\nPlease enter a number: ");
        num = scanner.nextInt();

        while (i <= num) {
            result *= i;
            i++;
        }

        System.out.printf("%d! = %d", num, result);
    }
}
