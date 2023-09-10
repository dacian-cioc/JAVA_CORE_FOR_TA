//Write a program that read the array and find the largest number multiple of 5 in
//the array.
//Example:
//Input:
//[1, 4, 5, 2, 7, 10, 14, 55, 17, 25, 15, 12]
//Output:
//55

package L03.homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the array from the user with error validation
        int[] array = readIntArray(scanner);

        int largestMultipleOf5 = findLargestMultipleOf5(array);

        if (largestMultipleOf5 != Integer.MIN_VALUE) {
            System.out.println("Largest number multiple of 5 in the array: " + largestMultipleOf5);
        } else {
            System.out.println("No multiple of 5 found in the array.");
        }

        scanner.close();
    }

    // Helper function to read an array with error validation for non-integer inputs
    private static int[] readIntArray(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Enter the elements of the array (comma-separated): ");
                String input = scanner.nextLine();
                String[] elements = input.split(",");
                int[] array = new int[elements.length];

                for (int i = 0; i < elements.length; i++) {
                    array[i] = Integer.parseInt(elements[i].trim());
                }

                return array;
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter valid integer values.");
            }
        }
    }

    // Helper function to find the largest number multiple of 5 in the array
    private static int findLargestMultipleOf5(int[] array) {
        int largestMultipleOf5 = Integer.MIN_VALUE;

        for (int number : array) {
            if (number % 5 == 0 && number > largestMultipleOf5) {
                largestMultipleOf5 = number;
            }
        }

        return largestMultipleOf5;
    }
}
