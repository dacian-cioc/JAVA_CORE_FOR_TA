//Write a program that accepts two integers from the user.
//Then create an array with 10 elements in the following way:
//- The first 2 elements of the array are the entered number.
//- Each subsequent element of the array is equal to the sum of the
//previous 2 elements in the array and if the index is:
//o even multiply the sum by 3
//o odd divide the sum by 2

package L03.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = 0;
        int second = 0;

        try {
            System.out.print("Enter the first integer: ");
            first = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter an integer.");
            System.exit(1);
        }

        try {
            System.out.print("Enter the second integer: ");
            second = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter an integer.");
            System.exit(1);
        }

        int[] array = new int[10];
        array[0] = first;
        array[1] = second;

        for (int i = 2; i < 10; i++) {
            int sum = array[i - 2] + array[i - 1];

            if (i % 2 == 0) {
                array[i] = sum * 3;
            } else {
                array[i] = sum / 2;
            }
        }

        // Display the resulting array
        System.out.print("Resulting array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
