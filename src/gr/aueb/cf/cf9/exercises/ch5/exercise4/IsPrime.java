package gr.aueb.cf.cf9.exercises.ch5.exercise4;

/**
 * Returns true if the number is prime.
 */
public class IsPrime {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 99991;

        System.out.printf("%d is%s prime\n", num1, isPrime(num1)? "" : " not");
        System.out.printf("%d is%s prime\n", num2, isPrime(num2)? "" : " not");
        System.out.printf("%d is%s prime\n", num3, isPrime(num3)? "" : " not");
    }

    public static Boolean isPrime(int num) {
        for (int i = 2; i <= (int) Math.sqrt(num) + 1; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
