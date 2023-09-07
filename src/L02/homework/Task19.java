//Write a program that should do the following:
//The program must accept (by the user) a number N from the interval [1-30].
//Program to output the first N number of Fibonacci numbers.
//Note: Fibonacci numbers starts with 0 and 1, and each subsequent member of
//the sequence is obtained as the sum of the previous two.
//Example:
//Input:
//10
//Output:
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34

package L02.homework;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;

        do {
            System.out.print("Enter a number in the range [1-30]: ");
            while (!scanner.hasNextInt()) {
                System.err.print("Invalid input. Enter a number: ");
                scanner.next(); // Clear the invalid input
            }
            N = scanner.nextInt();

            if (N < 1 || N > 30) {
                System.err.println("Invalid input. Please enter a number in the range [1-30].");
            }
        } while (N < 1 || N > 30);

        System.out.println("Fibonacci Sequence (First " + N + " numbers):");
        printFibonacci(N);

        scanner.close();
    }

    // Helper function to print the first N Fibonacci numbers
    private static void printFibonacci(int N) {
        long[] fibonacci = new long[N];
        fibonacci[0] = 0;
        if (N > 1) {
            fibonacci[1] = 1;
        }
        for (int i = 2; i < N; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < N; i++) {
            System.out.print(fibonacci[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
