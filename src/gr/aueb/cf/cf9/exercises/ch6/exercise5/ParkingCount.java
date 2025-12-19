package gr.aueb.cf.cf9.exercises.ch6.exercise5;

import java.util.Arrays;

public class ParkingCount {

    public static void main(String[] args) {
        int[][] carData = {{1012, 1136}, {1317, 1417}, {1015, 1020}, {1008, 1300}, {1238, 1321}, {1020, 1500}};
        int[][] arrDepData = findMaxParked(carData);

        for (int[] el : arrDepData) {
                System.out.printf("{%d, %d}, ", el[0], el[2]);
        }

    }


    /**
     * Get the max number of cars that where parked concurrently
     * given car arrival and departure data in a parking lot.
     * @param carData
     * @return
     */
    public static int[][] findMaxParked(int[][] carData) {
        int[][] arrivalDepartureData = new int[2 * carData.length][3];
        int maxPosition = 0;
        
        for (int i = 0; i < carData.length; i++) {
            arrivalDepartureData[i][0] = carData[i][0];
            arrivalDepartureData[i][1] = 1;
            arrivalDepartureData[i + carData.length][0] = carData[i][1];
            arrivalDepartureData[i + carData.length][1] = -1;
        }

        selectionSort(arrivalDepartureData, 0);

        arrivalDepartureData[0][2] = arrivalDepartureData[0][1];
        for (int i = 1; i < arrivalDepartureData.length; i++) {
            arrivalDepartureData[i][2] = arrivalDepartureData[i][1] + arrivalDepartureData[i - 1][2];
            if (arrivalDepartureData[i][2] > arrivalDepartureData[maxPosition][2]) maxPosition = i;
        }

        return arrivalDepartureData;
    }

    /**
     * Selection sort for a nested array.
     * @param arr
     * @param depth
     * @return
     */
    public static int[][] selectionSort(int[][] arr, int depth) {
        int minPosition = 0;
        int minValue;

        for (int i = 0; i < (arr.length - 1); i++) {
            minPosition = i;
            minValue = arr[minPosition][depth];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j][depth] < minValue) {
                    minPosition = j;
                    minValue = arr[minPosition][depth];
                }
            }
            swap(arr, minPosition, i);
        }

        return arr;
    }

    public static void swap(int[][] arr, int i, int j) {
        int[] tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
