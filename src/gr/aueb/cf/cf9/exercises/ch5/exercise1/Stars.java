package gr.aueb.cf.cf9.exercises.ch5.exercise1;

import java.util.Scanner;

/**
 * User inputs the number of stars (n).
 * Program prints:
 * 1. n stars horizontally
 * 2. n stars vertically
 * 3. n x n stars
 * 4. 1 to n stars
 * 5. n to 1 stars
 * 6. exit program
 */
public class Stars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int num = 0;

        do {
            System.out.println("""
                    Please choose one of the options below: 
                    1. Print n stars horizontally
                    2. Print n stars vertically
                    3. Print n x n stars
                    4. Print 1 to n stars
                    5. Print n to 1 stars
                    6. Exit program
                    """);
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    num = askForNum();
                    printHorizontal(num);
                }
                case 2 -> {
                    num = askForNum();
                    printVertical(num);
                }
                case 3 -> {
                    num = askForNum();
                    printSquare(num);
                }
                case 4 -> {
                    num = askForNum();
                    print1toN(num);
                }
                case 5 -> {
                    num = askForNum();
                    printNto1(num);
                }
                case 6 -> {
                    System.out.println("Exiting program...");
                }
                 }
        } while (choice != 6);
    }

    public static int askForNum() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        return scanner.nextInt();
    }
    public static void printHorizontal(int num) {

        for (int i = 0; i < num; i++) {
            System.out.print('*');
        }
        System.out.println();
    }

    public static void printVertical(int num) {

        for (int i = 0; i < num; i++) {
            System.out.println('*');
        }
    }

    public static void printSquare(int num) {

        for (int i = 0; i < num; i++) {
            printHorizontal(num);
        }
    }

    public static void print1toN(int num) {

        for (int i = 0; i < num; i++) {
            printHorizontal(i + 1);
        }
    }

    public static void printNto1(int num) {

        for (int i = 0; i < num; i++) {
            printHorizontal(num - i);
        }
    }


}
