package gr.aueb.cf.cf9.exercises.ch8;

import java.time.LocalDateTime;
import java.util.Scanner;

public class SimpleBank {
    static double balance = 500;
    static Scanner in  = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            deposit(-100);
        } catch (Exception e) {
            System.out.println("Negative amounts can't be deposited.");
        }

        try {
            withdraw(600);
        } catch (Exception e) {
            System.out.println("Insufficient balance.");
        }

    }
    public static void deposit(double amount) throws Exception {
        try {
            if (amount < 0) throw new Exception("The deposited amount can't be negative.");
            balance += amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + e.getMessage());
            throw e;
        }
    }

    public static void withdraw(double amount) throws Exception {
        try {
            if (amount < 0) throw new Exception("The withdrawn amount can't be negative.");
            if (amount > balance) throw new Exception("The withdrawn amount exceeds the remaining balance.");
            balance -= amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + e.getMessage());
            throw e;
        }
    }
}
