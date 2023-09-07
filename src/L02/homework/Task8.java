//Write a program that should do the following:
//To read a positive integer (n) entered by the user.
//Display the first n number of numbers that are divisible by 3.
//Example:
//Input:
//9
//Output:
//3, 6, 9, 12, 15, 18, 21, 24, 27

package L02.homework;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.print("Enter a positive integer (n): ");
            while (!scanner.hasNextInt()) {
                System.err.print("Invalid input. Enter a positive integer (n): ");
                scanner.next(); // Clear the invalid input
            }
            n = scanner.nextInt();

            if (n <= 0) {
                System.err.println("Invalid input. Please enter a positive integer.");
            }
        } while (n <= 0);

        System.out.print("The first " + n + " numbers divisible by 3: ");
        int count = 0;
        for (int i = 3; count < n; i += 3) {
            System.out.print(i);
            count++;
            if (count < n) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
