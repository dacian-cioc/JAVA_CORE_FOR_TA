package L03.homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = 0;

        // Input validation for the size of the array
        while (true) {
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                break;
            } else {
                System.err.println("Invalid input. Please enter a valid integer for the size of the array.");
                scanner.next(); // Clear the invalid input
            }
        }

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            // Input validation for array elements
            while (true) {
                if (scanner.hasNextInt()) {
                    array[i] = scanner.nextInt();
                    break;
                } else {
                    System.err.println("Invalid input. Please enter a valid integer for array element " + (i + 1) + ":");
                    scanner.next(); // Clear the invalid input
                }
            }
        }

        boolean isMirrored = checkIfMirrored(array);

        if (isMirrored) {
            System.out.println("The array is mirrored.");
        } else {
            System.out.println("The array is not mirrored.");
        }

        scanner.close();
    }

    public static boolean checkIfMirrored(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                return false;
            }
        }

        return true;
    }
}
