package L03.homework;

import java.util.Scanner;

public class Task6Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the comma-separated input for the first array from the user
        System.out.print("Enter the elements of the first array (comma-separated): ");
        String input1 = scanner.nextLine();
        String[] inputArray1 = input1.split(",");
        int[] firstArray = new int[inputArray1.length];
        for (int i = 0; i < inputArray1.length; i++) {
            firstArray[i] = Integer.parseInt(inputArray1[i]);
        }

        // Get the comma-separated input for the second array from the user
        System.out.print("Enter the elements of the second array (comma-separated): ");
        String input2 = scanner.nextLine();
        String[] inputArray2 = input2.split(",");
        int[] secondArray = new int[inputArray2.length];
        for (int i = 0; i < inputArray2.length; i++) {
            secondArray[i] = Integer.parseInt(inputArray2[i]);
        }

        scanner.close();

        // Compare the two arrays by manually iterating through both arrays and checking if each element is the same
        boolean areEqual = true;

        if (firstArray.length != secondArray.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    areEqual = false;
                    break;
                }
            }
        }

        // Display the result
        if (areEqual) {
            System.out.println("The two arrays are the same.");
        } else {
            System.out.println("The two arrays are not the same.");
        }
    }
}
