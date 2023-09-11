//You have a square two-dimensional array of natural numbers whose values are
//entered from the console (by the user). The program should print the sum of
//each of the diagonals of the array.
//Example:
//Input:
//1, 4, 6, 3
//5, 9, 7, 2
//4, 8, 1, 9
//2, 3, 4, 5
//Output:
//The main diagonal sum is: 16
//The second diagonal sum is: 20

package L03.homework;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;

        do {
            System.out.print("Enter the size of the square array (a positive integer): ");
            while (!scanner.hasNextInt()) {
                System.err.print("Invalid input. Please enter a positive integer: ");
                scanner.next(); // Clear the invalid input
            }
            size = scanner.nextInt();
        } while (size <= 0);

        int[][] squareArray = new int[size][size];

        // Get input for the square array from the user
        System.out.println("Enter the elements of the square array:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                squareArray[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        // Calculate and print the sum of the main diagonal
        int mainDiagonalSum = 0;
        for (int i = 0; i < size; i++) {
            mainDiagonalSum += squareArray[i][i];
        }

        // Calculate and print the sum of the secondary diagonal
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < size; i++) {
            secondaryDiagonalSum += squareArray[i][size - 1 - i];
        }

        System.out.println("Sum of the main diagonal: " + mainDiagonalSum);
        System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);
    }
}

