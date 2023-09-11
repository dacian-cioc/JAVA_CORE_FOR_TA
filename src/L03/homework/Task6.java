//Write a program that reads 2 arrays, then compares them and displays a
//message whether they are the same or not.

package L03.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first array from the user
        System.out.print("Enter the elements of the first array (comma-separated): ");
        String input1 = scanner.nextLine();
        int[] array1 = convertInputToArray(input1);

        // Read the second array from the user
        System.out.print("Enter the elements of the second array (comma-separated): ");
        String input2 = scanner.nextLine();
        int[] array2 = convertInputToArray(input2);

        // Compare the arrays using Arrays.equals
        boolean areEqual = Arrays.equals(array1, array2);

        // Display the result
        if (areEqual) {
            System.out.println("The two arrays are the same.");
        } else {
            System.out.println("The two arrays are not the same.");
        }

        scanner.close();
    }

    // Helper function to convert a comma-separated string input to an integer array
    private static int[] convertInputToArray(String input) {
        String[] elements = input.split(",");
        int[] array = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            try {
                array[i] = Integer.parseInt(elements[i].trim());
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter valid integers separated by commas.");
                System.exit(1);
            }
        }

        return array;
    }
}
