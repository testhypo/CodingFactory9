package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class SecretIterativeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 42;
        int num = 0;

        System.out.println("Please guess the secret number");

        while (true) {
            num = scanner.nextInt();
            if (num == SECRET) {
                System.out.println("You guessed the secret number!");
                break;
            } else {
                System.out.println("Try again!");
            }
        }
    }
}
