//Please enter 2 natural two-digit numbers from the keyboard - A and B.
//Multiply the two numbers and store the result in a variable.
//Check if the result is an even number.
//Check that the last digit of the result is divisible by 3.
//Display appropriate messages.

package L01.homework;

import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first natural two-digit number (A): ");
        int A = scanner.nextInt();

        System.out.print("Enter the second natural two-digit number (B): ");
        int B = scanner.nextInt();

        if ((A < 10 || A > 99) || (B < 10 || B > 99)) {
            System.out.println("Invalid input, please enter a natural two-digit number for A and B ");
        } else {

            // Multiply A and B
            int result = A * B;

            // Check if the result is even
            boolean isEven = result % 2 == 0;

            // Check if the last digit of the result is divisible by 3
            boolean isLastDigitDivisibleBy3 = result % 10 % 3 == 0;

            // Display appropriate messages
            if (isEven && isLastDigitDivisibleBy3) {
                System.out.println("The result (" + result + ") is even, and its last digit is divisible by 3.");
            } else if (isEven) {
                System.out.println("The result (" + result + ") is even, but its last digit is not divisible by 3.");
            } else if (isLastDigitDivisibleBy3) {
                System.out.println("The result (" + result + ") is odd, but its last digit is divisible by 3.");
            } else {
                System.out.println("The result (" + result + ") is odd, and its last digit is not divisible by 3.");
            }

            scanner.close();
        }
    }
}
