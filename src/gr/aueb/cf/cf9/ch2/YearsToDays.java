package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει την ηλικία του σε έτη (ακέραιος)
 * και το πρόγραμμα επιστρέφει την ηλικία σε ημέρες
 * θεωρούμε 1 ετος = 365 ημέρες
 * π.χ. 20 έτη -> 7300 ημέρες
 */
public class YearsToDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DAYS_IN_YEAR = 365;
        int ageInYears = 0;
        int ageInDays = 0;

        System.out.println("Παρακαλώ εισάγετε την ηλικία σας");
        ageInYears = scanner.nextInt();
        ageInDays = ageInYears * DAYS_IN_YEAR;

        System.out.printf("Ηλικία σε έτη: %d, Ηλικία σε ημέρες: %d%n", ageInYears, ageInDays);
    }
}
