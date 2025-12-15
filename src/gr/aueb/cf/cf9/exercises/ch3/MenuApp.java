package gr.aueb.cf.cf9.exercises.ch3;

import java.util.Scanner;

/**
 * Displays a menu repeatedly
 * until the user chooses the 'Exit' option (5)
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("""
                    Menu Options
                    1. Insert
                    2. Delete
                    3. Update
                    4. Search
                    5. Exit""");
            choice = scanner.nextInt();
            if (choice < 1 || choice > 5){
                System.out.println("Invalid option. Please enter a number between 1 and 5\n");
                continue;
            }
            if (choice == 1) {
                System.out.println("You chose Insert\n");
                choice = 0;

            } else if (choice == 2) {
                System.out.println("You chose Delete\n");
                choice = 0;

            } else if (choice == 3) {
                System.out.println("You chose Update\n");
                choice = 0;

            } else if (choice == 4) {
                System.out.println("You chose Search\n");
                choice = 0;

            } else {
                System.out.println("Exiting program ...");
            }

        } while (choice != 5);
    }
}
