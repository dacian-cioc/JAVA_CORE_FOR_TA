//Write a program where the user must enter a single word (string).
//The program to check if the entered string is a palindrome.
//Note: Palindrome – a word that is read left-to-right and right-to-left in the same
//way.
//Example:
//Input:
//kayak
//wow
//test
//Output:
//kayak is palindrome.
//wow is palindrome.
//test is not a palindrome.

package L04.homework;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[3];
        boolean[] results = new boolean[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            inputs[i] = scanner.nextLine();
            results[i] = isPalindrome(inputs[i]);
        }

        System.out.println("Palindrome Check Results:");

        for (int i = 0; i < 3; i++) {
            if (results[i]) {
                System.out.println(inputs[i] + " is a palindrome.");
            } else {
                System.out.println(inputs[i] + " is not a palindrome.");
            }
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase(); // Remove non-alphabet characters and convert to lowercase
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
