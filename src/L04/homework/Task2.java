//Write a program where the user must enter two strings.
//- The program to check which of the two strings is longer.
//- The program to print the length of the two strings.
//Example:
//Input:
//short, longString
//Output:
//The longest string is: longString
//short – 5, longString - 10

package L04.homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        int firstStringLength = firstString.length();
        int secondStringLength = secondString.length();

        System.out.println("Length of the first string (" + firstString + "): " + firstStringLength);
        System.out.println("Length of the second string (" + secondString + "): " + secondStringLength);

        if (firstStringLength > secondStringLength) {
            System.out.println("The longest string is: " + firstString);
        } else if (secondStringLength > firstStringLength) {
            System.out.println("The longest string is: " + secondString);
        } else {
            System.out.println("Both strings have the same length.");
        }

        scanner.close();
    }
}
