package L03.homework;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newArray = createNewArray(originalArray);

        System.out.println(Arrays.toString(newArray));
    }

    public static int[] createNewArray(int[] arr) {
        int n = arr.length;
        int half = n / 2;

        // Create a new array with the same elements as the second half of the original array
        int[] newArr = Arrays.copyOfRange(arr, half, n);

        // Add the elements of the original array in reverse order to the new array
        for (int i = n - 1; i >= half; i--) {
            newArr = appendElement(newArr, arr[i]);
        }

        return newArr;
    }

    public static int[] appendElement(int[] arr, int element) {
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = element;
        return newArr;
    }
}
