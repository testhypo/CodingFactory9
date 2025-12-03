package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Produce a message that contains the name of the user and the age.
 */
public class StrConcat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname = "";
        int age = 0;
        String message = "";

        // Data input, validation and data binding
        System.out.println("Please enter your first name: ");
        firstname = scanner.nextLine();

        System.out.println("Please enter your age: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number: ");
            scanner.nextLine();
        }
        age = scanner.nextInt();

        // Call a service method
        message = createMessage(firstname, age);

        // Print the results
        System.out.println(message);
    }

    /**
     * Create a message that contains the name of the user and the age.
     * @param firstname The user's first name.
     * @param age       The user's age.
     * @return
     */
    public static String createMessage(String firstname, int age) {
        return String.format("Hello, my name is %s and I am %d years old.", firstname, age);
    }
}
