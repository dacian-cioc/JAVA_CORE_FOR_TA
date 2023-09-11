//Write a program that should do the following:
//To read two different integers entered by the user.
//Display all the numbers in the interval.
//Example:
//Input:
//17, 30
//Output:
//17 18 19 20 21 22 23 24 25 26 27 28 29 30

package L02.homework;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        do {
            System.out.print("Enter the first integer: ");
            while (!scanner.hasNextInt()) {
                System.err.print("Invalid input. Enter a valid integer: ");
                scanner.next(); // Clear the invalid input
            }
            num1 = scanner.nextInt();

            System.out.print("Enter the second integer (different from the first): ");
            while (!scanner.hasNextInt()) {
                System.err.print("Invalid input. Enter a valid integer: ");
                scanner.next(); // Clear the invalid input
            }
            num2 = scanner.nextInt();

            if (num1 == num2) {
                System.err.println("The two integers are equal. Please enter different integers.");
            }
        } while (num1 == num2);

        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = num2; i <= num1; i++) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
