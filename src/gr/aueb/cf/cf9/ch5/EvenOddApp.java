package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Defines 2 methods: isEven, isOdd
 * to control an integer
 * if it is even or odd
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        System.out.println("isEven: " + isEven(num));
        System.out.println("isOdd: " + isOdd(num));
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return !isEven(num);
    }
}
