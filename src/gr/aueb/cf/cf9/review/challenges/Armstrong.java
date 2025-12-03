package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * An armstrong number a number
 * that is equal to the sum of its own digits,
 * each raised to the power of the total number of digits
 *
 * e.g. 153 = 1^3 + 5^3 + 3^3
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int numberofDigits = 0;
        int num = 0;
        int digit = 0;
        int sum = 0;

        System.out.println("Please enter a number: ");
        inputNum = scanner.nextInt();

        numberofDigits = String.valueOf(inputNum).length();

        num = inputNum;
        while (num > 0) {
            digit = num % 10;
            sum += (int) Math.pow(digit, numberofDigits);
            num /= 10;
        }

        System.out.printf("%d %s Armstrong\n", inputNum, (sum == inputNum) ? "is" : "is not");
    }
}
