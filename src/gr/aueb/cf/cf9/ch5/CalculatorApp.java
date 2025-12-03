package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * A simple calculator application
 */
public class CalculatorApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int result = 0;
        final int EXIT = 6;

        while (true) {
            printMenu();
            choice = getOneInt();

            if (!isChoiceValid(choice)) {
                System.out.println("The choice should be between 1-6");
                continue;
            }

            if (choice == EXIT) {
                System.out.println("Exiting...");
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println(" = " + result);
        }
    }

    public static void printMenu() {
        System.out.println("Please on the following: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Remainder of division");
        System.out.println("6. Exit");
    }

    public static int getOneInt() {
        return  scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
        return (choice >= 1) && (choice <= 6);
    }

    public static int getResultOnChoice(int choice) {
        int num1 = 0;
        int num2 = 0;

        System.out.println("Please enter two numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        return switch (choice) {
            case 1 -> add(num1, num2);
            case 2 -> sub(num1, num2);
            case 3 -> mul(num1, num2);
            case 4 -> div(num1, num2);
            case 5 -> mod(num1, num2);
            default -> 0;
        };
    }

    public static int add(int a, int b) {
        System.out.printf("%d + %d", a, b);
        return a + b;
    }

    public static int sub(int a, int b) {
        System.out.printf("%d - %d", a, b);
        return a - b;
    }

    public static int mul(int a, int b) {
        System.out.printf("%d * %d", a, b);
        return a * b;
    }

    public static int div(int a, int b) {
        System.out.printf("%d / %d", a, b);
        if (b == 0) return 0;
        return a / b;
    }

    public static int mod(int a, int b) {
        System.out.printf("%d %% %d", a, b);
        if (b == 0) return 0;
        return a % b;
    }




}
