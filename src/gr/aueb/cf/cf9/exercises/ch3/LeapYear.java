package gr.aueb.cf.cf9.exercises.ch3;

import java.util.Scanner;

/**
 * Determines if a year entered by the user
 * is a leap year or not.
 * A year is a leap year if it's divisible by 4,
 * except for years divisible by 100
 * unless they are also divisible by 400.
 * Examples of leap years: 2016, 2000
 * Examples of not leap years: 1900, 2005, 2006
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        boolean isLeapYear = false;

        System.out.println("Please enter the year: ");
        year = scanner.nextInt();

        if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 100 == 0) {
        } else if (year % 4 == 0) {
            isLeapYear = true;
        }

        System.out.printf("%d is leap year: %b%n", year, isLeapYear);
    }
}
