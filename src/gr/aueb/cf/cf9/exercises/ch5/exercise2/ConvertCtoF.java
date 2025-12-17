package gr.aueb.cf.cf9.exercises.ch5.exercise2;

import java.util.Scanner;

/**
 * Convert the temperature in Celcius to Fahrenheit.
 */
public class ConvertCtoF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float tempC = 0;
        float tempF = 0;
        String inputStr = "";
        boolean exit = false;

        do {
            System.out.println("Please enter the temperature in C: ");
            tempC = scanner.nextFloat();
            tempF = convert(tempC);
            System.out.println("The temperature in F is: " + tempF);

            System.out.println("Type 'q' to exit.");
            inputStr = scanner.next();
            if (inputStr.equals("q")) exit = true;
        } while (!exit);
    }

    public static float convert(float tempC) {
        return tempC * 9F / 5F + 32F;
    }
}
