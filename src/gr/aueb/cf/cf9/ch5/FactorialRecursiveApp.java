package gr.aueb.cf.cf9.ch5;

/**
 * Calculate the factorial of n
 * utilizing recursion
 */
public class FactorialRecursiveApp {

    public static void main(String[] args) {
        int num = 5;
        int result = 0;

        result = facto(num);

        System.out.printf("The factorial of %d is: %d", num, result);
    }

    public  static  int facto(int n) {
//        if (n ==1) {
//            return 1;
//        }
//        return n = n * facto(n - 1);
        return n <= 1 ? 1 : n * facto(n - 1);
    }
}
