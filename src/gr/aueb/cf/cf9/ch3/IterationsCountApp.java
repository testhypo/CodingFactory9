package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Count the number of iterations
 * when the user inserts -1,
 * the while loop will stop
 */
public class IterationsCountApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        while (num != -1){
            iterations++;
            System.out.println("Please enter a number: ");
            num  = scanner.nextInt();
        }

        System.out.println("The count of iterations was: " + iterations);
    }
}
