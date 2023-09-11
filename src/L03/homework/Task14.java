//Enter elements in a two-dimensional array of arbitrary dimension. Write a
//program that outputs the values of the elements in a two-dimensional array
//after it has been rotated by -90 degrees.
//Example:
//Input:
//1, 2, 3, 4
//5, 6, 7, 8
//9, 10, 11, 12
//13, 14, 15, 16
//Output:
//4, 8, 12, 16
//3, 7, 11, 15
//2, 6, 10, 14
//1, 5, 9, 13

package L03.homework;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows, cols;

        // Get the number of rows with validation
        do {
            System.out.print("Enter the number of rows in the 2D array (greater than 0): ");
            while (!scanner.hasNextInt()) {
                System.err.println("Invalid input. Please enter a valid number of rows.");
                scanner.next(); // Clear the invalid input
            }
            rows = scanner.nextInt();
        } while (rows <= 0);

        // Get the number of columns with validation
        do {
            System.out.print("Enter the number of columns in the 2D array (greater than 0): ");
            while (!scanner.hasNextInt()) {
                System.err.println("Invalid input. Please enter a valid number of columns.");
                scanner.next(); // Clear the invalid input
            }
            cols = scanner.nextInt();
        } while (cols <= 0);

        int[][] array = new int[rows][cols];

        // Get input for the 2D array with validation
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (!scanner.hasNextInt()) {
                    System.err.println("Invalid input. Please enter valid numeric values.");
                    scanner.next(); // Clear the invalid input
                }
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Original 2D array:");
        printArray(array);

        int[][] rotatedArray = rotateArray(array);

        System.out.println("Rotated 2D array:");
        printArray(rotatedArray);

        scanner.close();
    }

    public static void printArray(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;

        for (int[] row : array) {
            for (int j = 0; j < cols; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateArray(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;

        int[][] rotatedArray = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedArray[cols - j - 1][i] = array[i][j];
            }
        }

        return rotatedArray;
    }
}
