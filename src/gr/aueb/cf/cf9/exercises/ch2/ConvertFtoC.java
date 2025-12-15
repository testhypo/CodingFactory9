package gr.aueb.cf.cf9.exercises.ch2;

import java.util.Scanner;

/**
 * Convert the temperature provided by the user
 * from Fahrenheit to Celcius
 */
public class ConvertFtoC {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int tempF;
        int tempC;

        System.out.println("- Fahrenheit to Celcius converter -\nInput the temperature (°F): ");
        tempF = in.nextInt();
        tempC = 5*(tempF - 32)/9;

        System.out.println(tempC + " °C");

    }
}
