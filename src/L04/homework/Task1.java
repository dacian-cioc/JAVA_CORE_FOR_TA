//Write a method where the user enters a string that can contain lowercase and
//uppercase letters.
//The size of the string should not be greater than 50.
//Print to the console the entered string, but in uppercase letters.
//Print to the console the entered string, but in lowercase letters.
//Example:
//Input:
//Hello Java
//Output:
//HELLO JAVA, hello java

package L04.homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string (up to 50 characters): ");
        String input = scanner.nextLine();

        if (input.length() <= 50) {
            String upperCaseString = input.toUpperCase();
            String lowerCaseString = input.toLowerCase();

            System.out.println("Uppercase: " + upperCaseString);
            System.out.println("Lowercase: " + lowerCaseString);
            System.out.println("Uppercase + Lowercase: " +  upperCaseString + ", " + lowerCaseString);
        } else {
            System.out.println("The entered string is too long (maximum 50 characters).");
        }

        scanner.close();
    }
}
