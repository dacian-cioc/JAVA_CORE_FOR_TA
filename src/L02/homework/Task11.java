//Write a program that should do the following:
//To read a positive number (n) entered by the user.
//As result print a triangle with height equal to n.
//Example:
//Input:
//4
//Output:
//*
//***
//*****
//*******

package L02.homework;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.print("Enter a positive number (n): ");
            while (!scanner.hasNextInt()) {
                System.err.print("Invalid input. Enter a positive number (n): ");
                scanner.next(); // Clear the invalid input
            }
            n = scanner.nextInt();

            if (n <= 0) {
                System.err.println("Invalid input. Please enter a positive number.");
            }
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
