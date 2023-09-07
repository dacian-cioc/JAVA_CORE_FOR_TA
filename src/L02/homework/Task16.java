//Write a program that should do the following:
//The program must accept (by the user) a number N from the interval [10-30000].
//The program to check if the number entered is a palindrome.
//Note: What is a palindrome? A palindrome is a number that is read the same
//way front to back and back to front. Example: The number 28682 is a
//palindrome.

package L02.homework;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;

        do {
            System.out.print("Enter a number in the range [10-30000]: ");
            while (!scanner.hasNextInt()) {
                System.err.print("Invalid input. Enter a number: ");
                scanner.next(); // Clear the invalid input
            }
            N = scanner.nextInt();

            if (N < 10 || N > 30000) {
                System.err.println("Invalid input. Please enter a number in the range [10-30000].");
            } else if (N < 0) {
                System.err.println("Negative numbers are not allowed.");
            }
        } while (N < 10 || N > 30000 || N < 0);

        if (isPalindrome(N)) {
            System.out.println(N + " is a palindrome.");
        } else {
            System.out.println(N + " is not a palindrome.");
        }

        scanner.close();
    }

    // Helper function to check if a number is a palindrome
    private static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
