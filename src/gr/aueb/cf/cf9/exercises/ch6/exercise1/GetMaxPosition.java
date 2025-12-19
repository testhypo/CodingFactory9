package gr.aueb.cf.cf9.exercises.ch6.exercise1;

/**
 * Find the position of the max element of an integer array.
 */
public class GetMaxPosition {

    public static void main(String[] args) {
        int[] arr1 = {6, 9, 29, 67, 2, 8};

        System.out.printf("arr1 max is %d in position %d",arr1[getMaxPosition(arr1)], getMaxPosition(arr1));
        System.out.println();

    }

    public static int getMaxPosition(int[] arr) {
        int maxPosition = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxPosition]) {
                maxPosition = i;
            }
        }

        return maxPosition;
    }


}
