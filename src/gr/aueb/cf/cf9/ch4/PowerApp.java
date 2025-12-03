package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * The user enters base and power.
 * The program calculates base ^ power.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        System.out.println("Please enter base and power: ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.printf("%d ^ %d = %d", base, power, result);
    }
}
