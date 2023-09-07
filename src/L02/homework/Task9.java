//Write a program that should do the following:
//To read a natural numbers entered by the user.
//When number 0 is entered, the program should stop reading more numbers
//from the console.
//To output the smallest and largest number of all entered numbers.

package L02.homework;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int smallest = Integer.MAX_VALUE; // Initialize with a large value
        int largest = Integer.MIN_VALUE;  // Initialize with a small value

        do {
            System.out.print("Enter a natural number (0 to stop): ");
            while (!scanner.hasNextInt()) {
                System.err.print("Invalid input. Enter a natural number (0 to stop): ");
                scanner.next(); // Clear the invalid input
            }
            number = scanner.nextInt();

            if (number < 0) {
                System.err.println("Negative numbers are not allowed, please enter a new number");
            } else if (number != 0) {
                if (number < smallest) {
                    smallest = number;
                }
                if (number > largest) {
                    largest = number;
                }
            }
        } while (number != 0);

        if (smallest == Integer.MAX_VALUE || largest == Integer.MIN_VALUE) {
            System.err.println("No valid numbers were entered.");
        } else {
            System.out.println("Smallest number entered: " + smallest);
            System.out.println("Largest number entered: " + largest);
        }

        scanner.close();
    }
}
