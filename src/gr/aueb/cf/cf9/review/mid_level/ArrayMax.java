package gr.aueb.cf.cf9.review.mid_level;

public class ArrayMax {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};

        System.out.println(findMax(arr));
    }

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

