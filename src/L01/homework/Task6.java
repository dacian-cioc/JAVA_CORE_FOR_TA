//Please enter 1 four-digit natural number from the keyboard that falls within the
//range [1000 – 9999].
//Form 2 new two-digit numbers from the entered number:
//The first number is formed by the 1st and 4th digits.
//The second number is formed by the 2nd and 3rd digits.
//Compare the newly obtained two-digit numbers. Display an appropriate message.

package L01.homework;

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a four-digit natural number (between 1000 and 9999): ");
        int inputNumber = scanner.nextInt();

        if (inputNumber >= 1000 && inputNumber <= 9999) {
            // Extract individual digits
            int firstDigit = inputNumber / 1000;
            int secondDigit = (inputNumber / 100) % 10;
            int thirdDigit = (inputNumber / 10) % 10;
            int fourthDigit = inputNumber % 10;

            // Form two two-digit numbers
            int firstTwoDigitNumber = firstDigit * 10 + fourthDigit;
            int secondTwoDigitNumber = secondDigit * 10 + thirdDigit;

            // Compare the two two-digit numbers
            if (firstTwoDigitNumber == secondTwoDigitNumber) {
                System.out.println("The two two-digit numbers are equal.");
            } else if (firstTwoDigitNumber > secondTwoDigitNumber) {
                System.out.println("The first two-digit number is greater.");
            } else {
                System.out.println("The second two-digit number is greater.");
            }
        } else {
            System.out.println("Invalid input. Please enter a four-digit natural number in the range [1000 – 9999].");
        }

        scanner.close();
    }
}
