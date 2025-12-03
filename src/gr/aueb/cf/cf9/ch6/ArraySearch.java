package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {11, 22, 31, 40, 50, 61, 70, 18, 19, 170};
        int value = 0;
        int position = 0;

        System.out.println("Please enter a value to search for: ");
        value = scanner.nextInt();

        position = getPosition(arr, value);

        if (position == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value: " + value + " found at position: " + (position + 1));
        }
    }

    /**
     * Returns the position of the 1st element of the array
     * that equals the search value. If the value doesn't exist
     * it returns -1.
     *
     * @param arr   the input array
     * @param value the search value
     * @return the position of the found value, otherwise -1
     */
    public static int getPosition(int[] arr, int value) {
        if (arr == null) return -1;
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }

    public static int getPosition2(int[] arr, int value) {
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}


