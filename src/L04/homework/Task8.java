//Write a program that accepts a single integer from the user.
//The program calls the isOdd() method, which accepts an integer and returns a
//boolean value.
//The method to return true if the entered number is odd and false if it is even.
//Store the result in a variable and print to the console with an appropriate
//message.

package L04.homework;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Call the isOdd() method to check if the number is odd
        boolean isOdd = isOdd(number);

        if (isOdd) {
            System.out.println(number + " is an odd number.");
        } else {
            System.out.println(number + " is an even number.");
        }

        scanner.close();
    }

    // Method to check if a number is odd
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
