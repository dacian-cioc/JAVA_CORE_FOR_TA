//Write a program where the user must enter two strings.
//The program should merge the two strings and print the newly obtained one.
//Example:
//Input:
//Hello to; Java world
//Output:
//Hello to Java world

package L04.homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Remove punctuation and spaces from both strings and merge them
        String mergedString = (firstString + " " + secondString)
                .replaceAll("[^a-zA-Z0-9 ]", "") // Remove punctuation
                .replaceAll("\\s+", " "); // Remove extra spaces

        System.out.println("Merged string: " + mergedString);

        scanner.close();
    }
}
