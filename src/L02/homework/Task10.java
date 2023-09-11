//Write a program that should do the following:
//To read a positive number entered by the user.
//The program to determine whether the number is prime.
//Note: What is a prime number? Number that is divisible only by 1 and itself.

package L02.homework;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.print("Enter a positive number: ");
            while (!scanner.hasNextInt()) {
                System.err.print("Invalid input. Enter a positive number: ");
                scanner.next(); // Clear the invalid input
            }
            number = scanner.nextInt();

            if (number <= 0) {
                System.err.println("Invalid input. Please enter a positive number.");
            }
        } while (number <= 0);

        boolean isPrime = isPrime(number);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // Helper function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
