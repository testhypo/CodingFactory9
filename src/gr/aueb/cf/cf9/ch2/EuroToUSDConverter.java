package gr.aueb.cf.cf9.ch2;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη ένα ποσό (ακέραιος) σε ευρώ
 * και τον μετατρέπει σε δολάρια ΗΠΑ με βάση μια ισοτιμία.
 * Για παράδειγμα αν ο χρήστης δώσει 100 ευρώ και η ισοτιμία
 * είναι 1 Euro = 99 USA cents.
 * Τότε τα συνολικα USA cents είναι 9900 και αυτό αντιστοιχεί
 * σε 99 USA dollars και 0 cents
 */
public class EuroToUSDConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUSDCents = 0;
        int outputDollars = 0;
        int outputUSDCents = 0;
        final int EURO_TO_USDCENTS_CONVERSION = 99;

        System.out.println("Please enter the amount of Euros: ");
        inputEuros = scanner.nextInt();

        totalUSDCents = inputEuros * EURO_TO_USDCENTS_CONVERSION;
        outputDollars = totalUSDCents / 100;
        outputUSDCents = totalUSDCents % 100;

        System.out.printf("%d Euros are %d cents total\n", inputEuros, totalUSDCents);
        System.out.printf("That corresponds to %d USD and %d cents", outputDollars, outputUSDCents);
    }
}
