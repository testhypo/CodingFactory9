package gr.aueb.cf.cf9.exercises.ch6.exercise4;

public class GetLowAndHighIndexOf {

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 8;

        int[] lowAndHigh = getLowAndHighIndexOf(arr, key);
        System.out.printf("key: %d low: %d, high: %d", key, lowAndHigh[0], lowAndHigh[1]);
    }

    /**
     * Assuming a sorted integer array with repeated elements,
     * returns the lowest index and the highest index of an input integer key.
     * @param arr the input array
     * @param key the number that we are searching
     * @return {low, high} the lowest and the highest index that the key is found
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int[] lowAndHigh = {-1, -1};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lowAndHigh[0] = i;
                break;
            }
        }
        for (int i = lowAndHigh[0] + 1; i < arr.length; i++) {
            if (arr[i] == key) count++;
        }
        lowAndHigh[1] = lowAndHigh[0] + count;

        return lowAndHigh;
    }
}
