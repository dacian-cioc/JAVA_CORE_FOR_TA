//Write a program where the user must enter a string of several words separated
//by a space.
//To print the entered string, but the first letters of the individual words should be
//uppercase, the rest should be lowercase.
//Example:
//Input:
//mY tEsT stRinG
//Output:
//My Test String

package L04.homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string of words: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) { // Check for empty words (e.g., multiple spaces)
                // Capitalize the first letter and convert the rest to lowercase
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                result.append(capitalizedWord).append(" ");
            }
        }

        String finalResult = result.toString().trim(); // Remove trailing space

        System.out.println("Formatted string: " + finalResult);

        scanner.close();
    }
}
