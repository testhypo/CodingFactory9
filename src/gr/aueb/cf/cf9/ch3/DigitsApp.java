package gr.aueb.cf.cf9.ch3;


import java.util.Scanner;

/**
 * Calculates the number of digits of an integer
 * e.g. if the integer is 178, then the number of digits is 3
 */
public class DigitsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int digits = 0;
        int divisionResult = 0;

        System.out.println("Please enter an integer: ");
        num = scanner.nextInt();

        divisionResult = num;
        do {
            divisionResult /= 10;
            digits++;
        } while (divisionResult != 0);

        System.out.printf("%d has %d digits", num, digits);
    }
}
