//We have two one-dimensional arrays with natural numbers. Create a program
//that compares all numbers
//with the same indexes from both arrays and writes in a third array the smaller of
//the two numbers. At the end print the console the following:
//- the content of all three arrays
//- the sum of the three arrays
//- the product of the elements of the last array
//Example:
//Input:
//[18, 19, 32, 1, 3, 4, 5, 6, 7, 8]
//[ 1, 2, 3, 4, 5, 16, 17, 18, 27, 11]
//Output:
//The content of all 3 arrays
//[18, 19, 32, 1, 3, 4, 5, 6, 7, 8]
//[1, 2, 3, 4, 5, 16, 17, 18, 27, 11]
//[1, 2, 3, 1, 3, 4, 5, 6, 7, 8]
//The sum of the 3 arrays: 103 + 104 + 40 = 247
//The product of the elements of the third array: 120 960

package L03.homework;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] array1 = {18, 19, 32, 1, 3, 4, 5, 6, 7, 8};
        int[] array2 = {1, 2, 3, 4, 5, 16, 17, 18, 27, 11};
        int[] resultArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            resultArray[i] = Math.min(array1[i], array2[i]);
        }

        // Display the content of all three arrays
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Result Array: " + Arrays.toString(resultArray));

        // Calculate the sum of array1
        int sum1 = Arrays.stream(array1).sum();

        // Calculate the sum of array2
        int sum2 = Arrays.stream(array2).sum();

        // Calculate the sum of resultArray
        int sumResult = Arrays.stream(resultArray).sum();

        // Calculate sum of the 3 arrays
        int sumTotal = sum1 + sum2 + sumResult;

        System.out.println("Sum of the 3 arrays: " + sum1 + " " + "+ " + sum2 + " " + "+ " + sumResult + " " + "= " + sumTotal);

        // Calculate the product of the elements in the result array
        int product = 1;
        for (int num : resultArray) {
            product *= num;
        }
        System.out.println("Product of elements in the result array: " + product);
    }
}
