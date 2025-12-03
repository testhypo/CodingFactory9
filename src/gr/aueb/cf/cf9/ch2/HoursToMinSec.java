package gr.aueb.cf.cf9.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * The user inputs a number of hours
 * the program calculates the number of minutes
 * and the number of seconds
 * e.g. 1 hour -> 60 minutes; 3600 seconds
 */
public class HoursToMinSec {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        final int MINUTES_PER_HOUR = 60;
        final int SECONDS_PER_HOUR = 3600;
        int inputHours = 0;
        int outputMinutes = 0;
        int outputSeconds = 0;

        // Εντολές
        // Πάρε input από τον χρήστη
        System.out.println("Παρακαλώ εισάγετε τον αριθμό ωρών");
        inputHours = scanner.nextInt();

        // Επεξεργασία του input
        outputMinutes = inputHours * MINUTES_PER_HOUR;
        outputSeconds = inputHours * SECONDS_PER_HOUR;

        // Δώσε στον χρήστη το αποτέλεσμα
        System.out.printf("%d ώρες είναι:\n%,d λεπτά\n%,d δευτερόλεπτα\n", inputHours, outputMinutes, outputSeconds);
        System.out.printf(Locale.US, "The number of minutes is: %,d\n", outputMinutes);
        System.out.printf(Locale.forLanguageTag("el"), "The number of seconds is: %,d\n", outputSeconds);
    }
}
