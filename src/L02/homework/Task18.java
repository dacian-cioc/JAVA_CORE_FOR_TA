//Write a program that should do the following:
//The program must accept (by the user) a number N from the interval [1-10000].
//The program to reverse the number entered by the user and prints it in the
//console.
//Example:
//Input:
//4289
//Output:
//9824

package L02.homework;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;

        do {
            System.out.print("Enter a number in the range [1-10000]: ");
            while (!scanner.hasNextInt()) {
                System.err.print("Invalid input. Enter a number: ");
                scanner.next(); // Clear the invalid input
            }
            N = scanner.nextInt();

            if (N < 1 || N > 10000) {
                System.err.println("Invalid input. Please enter a number in the range [1-10000].");
            }
        } while (N < 1 || N > 10000);

        int reversedNumber = reverseNumber(N);

        System.out.println("Reversed Number: " + reversedNumber);

        scanner.close();
    }

    // Helper function to reverse a number
    private static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
