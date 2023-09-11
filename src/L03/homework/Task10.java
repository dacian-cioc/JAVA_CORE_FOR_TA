//A sequence of natural numbers we will call zigzag if the following conditions are
//met for its elements:
//N1 < N2 > N3 < N4 > N5 < … > Ni < Nj > … < Nn
//or
//N1 > N2 < N3 > N4 < N5 > … < Ni > Nj < … > Nn
//Write a program that checks whether a sequence of numbers entered into a
//one-dimensional array meet the above requirements.
//Example:
//Input:
//[1, 6, 3, 7, 2, 9, -2, 12, 5]
//[1, 2, 3, 4, 5, 6, 7, 8, 9]
//Output:
//Zigzag
//Not a Zigzag

package L03.homework;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sequence of numbers separated by commas: ");
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
        }

        boolean isZigzag = checkZigzagSequence(array);

        if (isZigzag) {
            System.out.println("Zigzag");
        } else {
            System.out.println("Not a Zigzag");
        }

        scanner.close();
    }

    public static boolean checkZigzagSequence(int[] arr) {
        int n = arr.length;

        if (n <= 2) {
            return true; // A sequence with 0, 1, or 2 elements is considered a zigzag
        }

        boolean increasing = false;
        boolean decreasing = false;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                increasing = true;
                if (decreasing) {
                    return false; // If both increasing and decreasing conditions met, it's not a zigzag
                }
            } else if (arr[i] < arr[i - 1]) {
                decreasing = true;
                if (increasing) {
                    return false; // If both increasing and decreasing conditions met, it's not a zigzag
                }
            }
        }

        return increasing || decreasing;
    }
}
