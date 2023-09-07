//Write a program that should do the following:
//To read a positive integer entered by the user.
//Display the sum of all numbers between 1 and the entered number.
//Example:
//Input:
//12
//Output:
//The sum of all numbers to 12 is = 78.

package L02.homework;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        do {
            System.out.print("Enter a positive integer: ");
            while (!scanner.hasNextInt()) {
                System.err.println("Invalid input. Enter a positive integer: ");
                scanner.next(); // Clear the invalid input
            }
            number = scanner.nextInt();


            // How to add this validation so I don't see the result like:
            // "Enter a positive integer: -5 is not correct number"
            if (number <= 0) {
                System.err.println(number + " is not positive number ");
            }

        } while (number <= 0);

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("The sum of all numbers up to " + number + " is = " + sum);

        scanner.close();
    }
}

