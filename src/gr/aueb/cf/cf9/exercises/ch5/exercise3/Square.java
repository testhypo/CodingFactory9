package gr.aueb.cf.cf9.exercises.ch5.exercise3;

import java.util.Scanner;

/**
 * Calculate the square of an integer number.
 */
public class Square {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        System.out.printf("%d ^ 2 = %d", num, square(num));
    }

    public static int square(int num) {
        return num * num;
    }
}
