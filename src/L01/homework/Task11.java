//Please enter a three-digit natural number.
//Perform a check between each of the three digits of this number and based on
//the check display a message:
//The numbers are equal.
//Ascending order.
//Descending order.
//Try with another number.

package L01.homework;

import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a three-digit natural number: ");
            int number = scanner.nextInt();

            if (isThreeDigitNatural(number)) {
                int digit1 = number / 100;
                int digit2 = (number / 10) % 10;
                int digit3 = number % 10;

                if (digit1 == digit2 && digit2 == digit3) {
                    System.out.println("The numbers are equal.");
                } else if (digit1 < digit2 && digit2 < digit3) {
                    System.out.println("Ascending order.");
                } else if (digit1 > digit2 && digit2 > digit3) {
                    System.out.println("Descending order.");
                } else {
                    System.out.println("Try with another number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a three-digit natural number.");
            }

            System.out.print("Do you want to try another number? (yes/no): ");
            String tryAgain = scanner.next().toLowerCase();

            if (!tryAgain.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }

    // Helper function to check if a number is a three-digit natural number
    private static boolean isThreeDigitNatural(int num) {
        return num >= 100 && num <= 999;
    }
}
