//Write a program that aims to output all natural three-digit numbers that do not
//have the same digits.

package L02.homework;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Three-digit numbers with distinct digits:");

        for (int number = 102; number <= 987; number++) {
            if (hasDistinctDigits(number)) {
                System.out.println(number);
            }
        }

        scanner.close();
    }

    // Helper function to check if a number has distinct digits
    private static boolean hasDistinctDigits(int number) {
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        return digit1 != digit2 && digit2 != digit3 && digit1 != digit3;
    }
}
