//Write a program that should do the following:
//- To read a char from the keyboard.
//- If Y / y char is entered, the program must print "Yes" in the console
//- When N / n char is entered, the program must print "No" in the console
//- Use Switch state

package L02.homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character (Y/y for Yes, N/n for No): ");
        String input = scanner.next();

        if (input.length() == 1) {
            char inputChar = input.charAt(0);
            switch (Character.toLowerCase(inputChar)) {
                case 'y':
                    System.out.println("Yes");
                    break;
                case 'n':
                    System.out.println("No");
                    break;
                default:
                    System.err.println("Invalid input");
                    break;
            }
        } else {
            System.err.println("Please enter only a single character.");
        }

        scanner.close();
    }
}
