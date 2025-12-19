package gr.aueb.cf.cf9.exercises.ch6.exercise2;

/**
 * Various simple array methods.
 */
public class ArrayMethods {

    public static void main(String[] args) {
        int[] arr1 = {1, -1, 2, -2, 3, -3};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {-1, 0, -23, -7};

        System.out.println(findPosition(arr1, 2));

        System.out.print("arr1 evens: ");
        printEven(arr1);
        System.out.println();

        System.out.print("arr1 doubled: ");
        int[] arr1double = mapToDouble(arr1);
        for (int el : arr1double) {
            System.out.print(el + " ");
        }
        System.out.println();

        System.out.println("isSomePositive(arr1) = " + isSomePositive(arr1));
        System.out.println("isSomePositive(arr2) = " + isSomePositive(arr2));
        System.out.println("isSomePositive(arr3) = " + isSomePositive(arr3));

        System.out.println("isAllPositive(arr1) = " + isAllPositive(arr1));
        System.out.println("isAllPositive(arr2) = " + isAllPositive(arr2));
        System.out.println("isAllPositive(arr3) = " + isAllPositive(arr3));
    }

    /**
     * Find the position of a certain array value, if it exists.
     * @param arr
     * @param value
     * @return value position
     */
    public static int findPosition(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    /**
     * Print all the even numbers of an array.
     * @param arr
     */
    public static void printEven(int[] arr) {
        for (int el : arr) {
            if (el % 2 == 0) {
                System.out.print(el + " ");
            }
        }
    }

    /**
     * Map all the elements of an array to twice their value.
     * @param arr
     * @return array * 2
     */
    public static int[] mapToDouble(int[] arr) {
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i] * 2;
        }
        return arr2;
    }

    /**
     * Return true if there is at least one positive integer in an array.
     * @param arr
     * @return boolean
     */
    public static boolean isSomePositive(int[] arr) {
        for (int el : arr) {
            if (el > 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return true if all integers are positive in an array.
     * @param arr
     * @return boolean
     */
    public static boolean isAllPositive(int[] arr) {
        for (int el : arr) {
            if (el <= 0) {
                return false;
            }
        }
        return true;
    }
}
