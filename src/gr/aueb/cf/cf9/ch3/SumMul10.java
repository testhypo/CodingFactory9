package gr.aueb.cf.cf9.ch3;

/**
 * Sum numbers 1-10
 * Multiply numbers 1-10
 */
public class SumMul10 {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int outputSum = 0;
        int outputMul = 1;

        while (i <= 10) {
            outputSum += i;
            i++;
        }

        while (j <= 10) {
            outputMul *= j;
            j++;
        }

        System.out.println("sum total is " + outputSum);
        System.out.println("Multiplication total is " + outputMul);
    }
}
