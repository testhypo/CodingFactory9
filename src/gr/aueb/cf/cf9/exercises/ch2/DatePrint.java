package gr.aueb.cf.cf9.exercises.ch2;

import java.util.Scanner;

/**
 * User inputs day, month, year
 * Outputs the date formated DD/MM/YY
 */
public class DatePrint {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int day;
        int month;
        int year;

        System.out.print("Day: ");
        day = in.nextInt();
        System.out.print("Month: ");
        month = in.nextInt();
        System.out.print("Year: ");
        year = in.nextInt();
        year = year % 100; // get the last 2 digits

        System.out.printf("The date is %02d/%02d/%02d", day, month, year);
    }
}
