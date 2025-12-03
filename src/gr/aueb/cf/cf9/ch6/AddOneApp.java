package gr.aueb.cf.cf9.ch6;

/**
 * Assume that we represent large integers
 * in array format. We want to add one.
 */
public class AddOneApp {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 9};
        int[] arr3 = {9, 9, 9, 9};

        printArr(arr1);
        System.out.print(" + 1 = ");
        printArr(addOne(arr1));
        System.out.println();

        printArr(arr2);
        System.out.print(" + 1 = ");
        printArr(addOne(arr2));
        System.out.println();

        printArr(arr3);
        System.out.print(" + 1 = ");
        printArr(addOne(arr3));
        System.out.println();
    }

    /**
     * Adds one to an array that represents an integer
     * @param arr the input array
     * @return    an array with the result
     */
    public static int[] addOne(int[] arr) {
        if (arr == null) return new int[0];
        int[] resultArr = new int[arr.length + 1];
        int carry = 1;
        int sum = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            sum = arr[i] + carry;
            resultArr[i + 1] = sum % 10;
            carry = sum / 10;
        }
        resultArr[0] = carry;

        return resultArr;
    }


    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num);
        }
    }

}
