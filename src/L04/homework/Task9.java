//Write a program that accepts a single integer from the user (as a string).
//The program calls the factoriel() method, which accepts an integer and returns
//the factorial of the given number.
//Store the result in a variable and print to the console with an appropriate
//message.

package L04.homework;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to calculate its factorial: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);

            // Call the factorial() method to calculate the factorial
            long result = factorial(number);

            System.out.println("The factorial of " + number + " is: " + result);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close();
    }

    // Method to calculate the factorial of a number
    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        if (number == 0 || number == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }
}

