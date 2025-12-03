package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * The user inserts the weight in kilos (integer)
 * The program calculates the weight in grams
 */
public class KiloToGrams {

    public static void main(String[] args) {
        int inputKilos = 0;
        int outputGrams = 0;
        final int GRAMS_PER_KILO = 1000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε το βάρος σε κιλά");
        inputKilos = scanner.nextInt();
        outputGrams = inputKilos * GRAMS_PER_KILO;

        System.out.printf("%d κιλά είναι %,d γραμμάρια",  inputKilos, outputGrams);
    }
}
