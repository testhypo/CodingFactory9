package gr.aueb.cf.cf9.ch6;

/**
 * When references are copied then
 * the copy is shallow,
 * and it has side effects.
*/
public class ArrayShallowCopy {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1; // Shallow copy

        arr2[2]  = 1000;
        System.out.println("arr1[2]: " + arr1[2]); // every change to arr2 applies to arr1
    }
}
