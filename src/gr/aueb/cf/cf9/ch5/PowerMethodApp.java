package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Receives base and power input from the user
 * The program calculates base ^ power using a method
 */
public class PowerMethodApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Please enter base and power: ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        result = raise(base, power);

        System.out.printf("%d ^ %d = %d", base, power, result);
    }

    /**
     * Calculates the exponent of a base raised to a power
     *
     * @param base the input base integer
     * @param power the input power integer
     * @return the result of base ^ power
     */
    private static int raise(int base, int power) {
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        return result;
    }
}
