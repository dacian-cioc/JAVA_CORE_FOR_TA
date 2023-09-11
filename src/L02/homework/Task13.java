//Write a program that accepts (by the user) a natural number N from the interval
//[10-300].
//The program should display in reverse order all the numbers that are multiples
//of 7 and are smaller than N.

package L02.homework;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;

        do {
            System.out.print("Enter a natural number in the range [10-300]: ");
            while (!scanner.hasNextInt()) {
                System.err.print("Invalid input. Enter a natural number: ");
                scanner.next(); // Clear the invalid input
            }
            N = scanner.nextInt();

            if (N < 10 || N > 300) {
                System.err.println("Invalid input. Please enter a natural number in the range [10-300].");
            }
        } while (N < 10 || N > 300);

        System.out.println("Multiples of 7 smaller than " + N + " in reverse order:");

        for (int i = N - 1; i >= 10; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
