package gr.aueb.cf.cf9.ch4;

/**
 * Calculates and prints the sum and product
 * of the first 10 integers
 */
public class SumMulApp {

    public static void main(String[] args) {
       int sum = 0;
       int mul = 1;

       for (int i=1; i <= 10; i++) {
           sum += i;
           mul *= i;
       }

        System.out.println("1+2+...+10 = " + sum);
        System.out.println("1*2*...*10 = " + mul);
    }
}
