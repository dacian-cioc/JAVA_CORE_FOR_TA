//Write a Java program to remove the specific letters from a string and return the
//new string. Specific letters: "p", "q", or "r".

package L04.homework;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeSpecificLetters(input);

        System.out.println("New string after removing 'p', 'q', and 'r': " + result);

        scanner.close();
    }

    public static String removeSpecificLetters(String input) {
        // Replace 'p', 'q', and 'r' with an empty string
        String result = input.replaceAll("[pqr]", "");

        return result;
    }
}
