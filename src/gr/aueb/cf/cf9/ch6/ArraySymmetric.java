package gr.aueb.cf.cf9.ch6;

/**
 * Checks if an integer array
 * is symmetrical or not
 * An array is symmetrical if it's the same read
 * forwards and backwards
 * e.g. [1, 2, 3, 2, 1]
 */
public class ArraySymmetric {

    public static void main(String[] args) {
        int[] arr1 = {1 , 2, 3, 2, 1};
        int[] arr2 = {1 , 2, 3, 3, 2, 1};
        int[] arr3 = {2, 3, 5, 6, 7};

        System.out.println("arr1 is symmetric: " + isSymmetric(arr1));
        System.out.println("arr2 is symmetric: " + isSymmetric(arr2));
        System.out.println("arr3 is symmetric: " + isSymmetric(arr3));

    }

    public static boolean isSymmetric(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            if (arr[i] != arr[len - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSymmetric2(int[] arr) {
        // boolean isSymmetric = true;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                // isSymmetric = false;
                // break
                return false;
            }
        }
        return true;
    }
}
