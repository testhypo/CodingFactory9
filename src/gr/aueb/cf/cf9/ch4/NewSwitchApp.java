package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class NewSwitchApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please enter a grade: ");
        grade = scanner.nextInt();

        switch (grade) {
            case 1, 2, 3, 4 -> System.out.println("Doesn't pass");
            case 5, 6 -> System.out.println("Good");
            case 7, 8 -> System.out.println("Very good");
            case 9, 10 -> System.out.println("Excellent!");
            default -> System.out.println("Grade should be between 1-10");
        }
    }
}
