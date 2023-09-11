//Write a program in which the user enters an array, then turns the elements of
//the array (this should be a change to affect the array itself) in reverse order and
//outputs them. Solve the problem with:
//- one additional array
//- no additional arrays
//Example:
//Input:
//[1, 2, 3, 4, 5]
//Output:
//[5, 4, 3, 2, 1]

package L03.homework;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the array elements from the user
        System.out.print("Enter the elements of the array (comma-separated): ");
        String input = scanner.nextLine();
        String[] elements = input.split(",");
        int[] array = new int[elements.length];

        // Validate and parse input elements
        for (int i = 0; i < elements.length; i++) {
            try {
                array[i] = Integer.parseInt(elements[i].trim());
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter valid integers separated by commas.");
                System.exit(1);
            }

            // Validate that elements are non-negative
            if (array[i] < 0) {
                System.err.println("Invalid input. Please enter non-negative integers.");
                System.exit(1);
            }
        }

        // Reverse the array using one additional array
        int[] reversedArray1 = reverseArrayWithAdditionalArray(array);

        // Reverse the array without using any additional arrays
        reverseArrayInPlace(array);

        // Output the reversed arrays
        System.out.println("Reversed array using one additional array: ");
        printArray(reversedArray1);

        System.out.println("Reversed array without additional array: ");
        printArray(array);

        scanner.close();
    }

    // Reverse the array using one additional array
    private static int[] reverseArrayWithAdditionalArray(int[] array) {
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }

        return reversedArray;
    }

    // Reverse the array without using any additional arrays
    private static void reverseArrayInPlace(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    // Print the elements of an array
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
