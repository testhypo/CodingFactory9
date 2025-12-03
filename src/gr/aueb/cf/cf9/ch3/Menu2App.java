package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Displays a menu until the user selects "Exit" (number 3)
 */
public class Menu2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("""
                    Please choose one of the following:
                    1. Submit application
                    2. Delete application
                    3. Exit
                    """);
            choice = scanner.nextInt();
            if (choice == 3) {
                System.out.println("Thank you for using the program");
                break;
            }
        }
    }
}
