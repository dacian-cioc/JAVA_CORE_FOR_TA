//Write a program that accepts a positive number N (entered by the user).
//The program to calculate the value of N! (N factorial).
//Example:
//Input:
//4
//Calculations:
//4! = 1*2*3*4 = 24
//Output:
//24

package L02.homework;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;

        do {
            System.out.print("Enter a positive number (N): ");
            while (!scanner.hasNextInt()) {
                System.err.print("Invalid input. Enter a positive number (N): ");
                scanner.next(); // Clear the invalid input
            }
            N = scanner.nextInt();

            if (N <= 0) {
                System.err.println("Invalid input. Please enter a positive number.");
            }
        } while (N <= 0);

        long factorial = calculateFactorial(N);

        System.out.println(N + "! = " + factorial);

        scanner.close();
    }

    // Helper function to calculate the factorial of a number
    private static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
