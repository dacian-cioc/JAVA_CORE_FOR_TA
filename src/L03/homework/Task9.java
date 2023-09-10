//Write a program that reads array with 10 numbers and exchanged places of
//elements with indexes:
//- 0 and 1, 8 and 9 via third variable
//- 2 and 3 by addition / subtraction
//- 4 and 5 by multiplication
//- 6 and 7 by bitwise operations (optional) or by third variable
//Example:
//Input:
//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//Output:
//[2, 1, 4, 3, 6, 5, 8, 7, 10, 9]

package L03.homework;

public class Task9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Exchange elements at indexes 0 and 1 using a third variable
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;

        // Exchange elements at indexes 8 and 9 using a third variable
        temp = array[8];
        array[8] = array[9];
        array[9] = temp;

        // Exchange elements at indexes 2 and 3 by addition/subtraction
        array[2] = array[2] + array[3];
        array[3] = array[2] - array[3];
        array[2] = array[2] - array[3];

        // Exchange elements at indexes 4 and 5 by multiplication
        array[4] = array[4] * array[5];
        array[5] = array[4] / array[5];
        array[4] = array[4] / array[5];

        // Exchange elements at indexes 6 and 7 by bitwise operations or third variable
        temp = array[6];
        array[6] = array[7];
        array[7] = temp;

        // Display the modified array
        System.out.println("Array after exchanges:");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

}
