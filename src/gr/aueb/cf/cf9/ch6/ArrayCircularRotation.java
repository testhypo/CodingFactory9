package gr.aueb.cf.cf9.ch6;

/**
 * Shift an array left or right by an offset
 */
public class ArrayCircularRotation {

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 8};
        final int RIGHT = 2;
        final int LEFT = 1;
        
        int[] arr2 = shiftRightBy(arr1, RIGHT);
        int[] arr3 = shiftLeftBy(arr1, LEFT);

        ArraysAndMethods.printArray(arr1);
        System.out.printf("\nright by %d: ", RIGHT);
        ArraysAndMethods.printArray(arr2);
        System.out.printf("\nleft by %d: ", LEFT);
        ArraysAndMethods.printArray(arr3);
    }

    public static int[] shiftRightBy(int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }

        return rotated;
    }

    public static int[] shiftLeftBy(int[] arr, int offset) {
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }

        return rotated;
    }
}
