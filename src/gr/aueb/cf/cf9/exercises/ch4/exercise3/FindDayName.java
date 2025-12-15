package gr.aueb.cf.cf9.exercises.ch4.exercise3;

import java.util.Scanner;

/**
 * The user inserts an integer from 1-7
 * Program print the name of the corresponding day
 * e.g. 1 -> Monday
 */
public class FindDayName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        while (!(num >= 1 && num <= 7)) {
            System.out.println("Please enter an integer number from 1 to 7: ");
            num = scanner.nextInt();
        }

        switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
