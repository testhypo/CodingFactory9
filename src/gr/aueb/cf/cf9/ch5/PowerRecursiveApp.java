package gr.aueb.cf.cf9.ch5;

/**
 * Calculates base ^ power
 * using a recursive method
 */
public class PowerRecursiveApp {

    public static void main(String[] args) {
        int base = 3;
        int power = 3;

        System.out.printf("%d ^ %d = %d", base, power, powerRecursive(base, power));
    }

    public static int powerRecursive( int base, int power) {
        return power <= 0 ? 1 : base * powerRecursive(base, power - 1);
    }
}
