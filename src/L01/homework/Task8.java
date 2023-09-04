//Please enter a three-digit number from the keyboard, without the digit 0 in this
//number.
//Check if the entered number is divisible by each of its digits.

package L01.homework;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Scenario 1: enter number, it will do a loop until correct number is entered
//        int number;
//
//        do {
//            System.out.print("Enter a three-digit number without the digit 0: ");
//            number = scanner.nextInt();
//        } while (!isValidNumber(number));

        // Scenario 2: Enter more than 3 digits, it will truncate entry to 1st 3 digits
        System.out.print("Enter a three-digit number without the digit 0: ");
        //final int number = Integer.parseInt(new Scanner(System.in).nextLine().substring(0, 3));

        int number = scanner.nextInt();

        boolean containsZero = containsDigit(number, 0);

        if (containsZero) {
            System.out.println("The number cannot contain 0.");
        } else {
            if (number >= 100 && number <= 999) {

                // Extract individual digits
                int digit1 = number / 100;
                int digit2 = (number / 10) % 10;
                int digit3 = number % 10;

                boolean isDivisibleByAllDigits = (number % digit1 == 0) && (number % digit2 == 0) && (number % digit3 == 0);

                if (isDivisibleByAllDigits) {
                    System.out.println("The number is divisible by all its digits.");
                } else {
                    System.out.println("The number is not divisible by all its digits.");
                }

                scanner.close();

            } else {
                System.out.println("Please enter a valid three-digit number without the digit 0 ");
            }
        }

        // Part of Scenario 1 Helper function to check if a number is a three-digit number without the digit 0
//    private static boolean isValidNumber(int num) {
//        return num >= 100 && num <= 999 && num % 10 != 0 && (num / 10) % 10 != 0;
//    }
    }

    private static boolean containsDigit(int num, int digit) {
        while (num != 0) {
            int currentDigit = num % 10;
            if (currentDigit == digit) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}

