package gr.aueb.cf.cf9.exercises.ch6.exercise1;

/**
 * Find the second-smallest number in an integer array.
 */
public class GetSecondMin {

    public static void main(String[] args) {
        int[] arr1 = {6, 9, 29, 67, 2, 8};
        int[] arr2 = {1, 2, 3, 4, 1};

        System.out.println("arr1 second min is " + getSecondMin(arr1));
        System.out.println("arr2 second min is " + getSecondMin(arr2));
    }

    public static int getSecondMin(int[] arr) {

        int minPosition = 0;
        int secondMinPosition = 1;

        if (arr[0] > arr[1]) {
            minPosition = 1;
            secondMinPosition = 0;
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < arr[minPosition]) {
                secondMinPosition = minPosition;
                minPosition = i;
            } else if (arr[i] < arr[secondMinPosition]) {
                secondMinPosition = i;
            }
        }

        return arr[secondMinPosition];

    }
}
