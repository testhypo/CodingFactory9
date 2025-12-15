package gr.aueb.cf.cf9.exercises.ch4.exercise2;

/**
 * Exercise 2
 * 1. Print all even number from 1 to 20.
 * 2. Find the sum of numbers from 1 to 50.
 * 3. Print numbers 1 to 10 in reverse (10 9 8 ... 1)
 * 4. Make a (*) pyramid with 4 rows
 *     *
 *    ***
 *   *****
 *  *******
 */
public class ForLoopApp {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }

        System.out.println();
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        System.out.println("1+2+3+ ... +50 = " + sum);

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        final int N = 4;
        for (int i = 0; i < N ; i++) {
            for(int j = 0; j < 2 * N + 1; j++) {
                if (Math.abs(j - N - 1) <= i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
