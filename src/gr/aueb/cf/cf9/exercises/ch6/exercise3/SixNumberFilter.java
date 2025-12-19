package gr.aueb.cf.cf9.exercises.ch6.exercise3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * User enters 6 numbers from 1-49.
 * Program checks if the following conditions are satisfied:
 * 1. The numbers don't have more than 3 evens.
 * 2. The numbers don't have more than 3 odds.
 * 3. There aren't more than 3 consecutive numbers.
 * 4. There aren't more than 3 numbers with the same last digit.
 * 5. There aren't more than 3 numbers in the same ten group.
 */
public class SixNumberFilter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int[] arr = new int[6];

        System.out.println("Please enter 6 integer numbers between 1 and 49:");
        for (int i = 0; i < 6; i++) {
            num = scanner.nextInt();
            while (num < 1 || num > 49) {
                System.out.println(num + " is outside the range 1 - 49. Please re-enter.");
                num = scanner.nextInt();
            }
            arr[i] = num;
        }

        System.out.print("Final numbers: ");
        for (int el : arr) {
            System.out.print(el + " ");
        }

        System.out.println("\n");
        System.out.printf("""
                Tests
                Not over three evens: %s
                Not over three odds: %s
                Not over three consecutive: %s
                Not over three same last digit: %s
                Not over three same tens group: %s
                """,
                hasOverThreeEvens(arr) ? "Not pass":"Pass",
                hasOverThreeOdds(arr) ? "Not pass":"Pass",
                hasOverThreeConsecutive1(arr) ? "Not pass":"Pass",
                hasOverThreeSameLastDigit(arr) ? "Not pass":"Pass",
                hasOverThreeSameTens(arr) ? "Not pass":"Pass");
    }

    public static boolean hasOverThreeEvens(int[] arr) {
        int counter = 0;
        for (int el : arr) {
            if (el % 2 == 0) counter++;
            if (counter > 3) return true;
        }
        return false;
    }

    public static boolean hasOverThreeOdds(int[] arr) {
        int counter = 0;
        for (int el : arr) {
            if (el % 2 == 1) counter++;
            if (counter > 3) return true;
        }
        return false;
    }

    /**
     * Returns true if the array has over 3 consecutive numbers,
     * assuming the order doesn't matter.
     * @param arr
     * @return
     */
    public static boolean hasOverThreeConsecutive1(int[] arr) {
        int[] sorted = new int[arr.length];
        int counter = 1;

        sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);

        for (int i = 0; i < sorted.length - 1; i++) {
            if (sorted[i + 1] == sorted[i] + 1) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter > 3) return true;
        }
        return false;
    }

    /**
     * Returns true if the array has over 3 consecutive numbers,
     * assuming the order does matter.
     * @param arr
     * @return
     */
    public static boolean hasOverThreeConsecutive2(int[] arr) {
        int counterUp = 1;
        int counterDown = 1;

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i+1] == arr[i] + 1) {
                counterUp++;
            } else {
                counterUp = 1;
            }
            if (arr[i] == arr[i+1] + 1) {
                counterDown++;
            } else {
                counterDown = 1;
            }

            if (counterUp > 3 || counterDown > 3) return true;
        }
        return false;
    }

    /**
     * Returns true if the array has over 3 elements with the same last digits.
     * @param arr
     * @return
     */
    public static boolean hasOverThreeSameLastDigit(int[] arr) {
        int[]  lastDigitCount = new int[10];
        for (int el : arr) {
            lastDigitCount[el % 10]++;
            if (lastDigitCount[el % 10] > 3) return true;
        }
        return false;
    }

    /**
     * Returns true if the array has over 3 elements in the same group of ten.
     * @param arr
     * @return
     */
    public static boolean hasOverThreeSameTens(int[] arr) {
        int[] tensGroup = new int[5];       // Since the number range is 1-49
        for (int el : arr) {
            tensGroup[el / 10]++;
            if (tensGroup[el / 10] > 3) return true;
        }
        return false;
    }

}
