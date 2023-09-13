//Write a Java program where the user must enter a string - email.
//The program should check is this a valid email string or not – use regex.
//Display the result in the console.

package L04.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();

        boolean isValid = isValidEmail(email);

        if (isValid) {
            System.out.println(email + " is a valid email address.");
        } else {
            System.out.println(email + " is not a valid email address.");
        }

        scanner.close();
    }

    public static boolean isValidEmail(String email) {
        // Regular expression pattern for a valid email address
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
