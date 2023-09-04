//Please enter a natural number from the keyboard in the range [0-24].
//Based on the number entered, print a message that welcomes you. Business
//logic should be based on the following intervals:
//5-10 – Good morning
//11-18 – Good day
//19-23 – Good evening
//24-5 – Why aren't you sleeping?

package L01.homework;

import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number in the range [0-24]: ");
        int userInput = scanner.nextInt();

        if (userInput >= 0 && userInput <= 24) {
            if (userInput >= 5 && userInput <= 10) {
                System.out.println("Good morning");
            } else if (userInput >= 11 && userInput <= 18) {
                System.out.println("Good day");
            } else if (userInput >= 19 && userInput <= 23) {
                System.out.println("Good evening");
            } else {
                System.out.println("Why aren't you sleeping?");
            }
        } else {
            System.out.println("Invalid input. Please enter a natural number in the range [0-24].");
        }

        scanner.close();
    }
}
