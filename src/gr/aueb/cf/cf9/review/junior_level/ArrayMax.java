package gr.aueb.cf.cf9.review.junior_level;

/**
 * Problems with this code:
 * - Variables a, m are not good variable names
 * - Methods should be used
 * - No documentation
 * - No check for empty array
 * - No structure
 * - No separation of concerns
 */
public class ArrayMax {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5};
        int m = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        System.out.println(m);
    }
}
