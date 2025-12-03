package gr.aueb.cf.cf9.ch6;

/**
 * Finds the smallest element of an array
 */
public class ArrayMin {

    public static void main(String[] args) {

    }

    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        return minPosition;
    }

    public static int getMinPosition2(int[] arr)  {
        if (arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = minPosition; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int[] arr)  {
        if (arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = maxPosition; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
