// Please enter 3 variables from the keyboard - time (integer type), amount of
//money (floating point number), am I at work (boolean type).
//Write a program that makes a decision based on the data entered by the user in
//the following way:
//If I'm at work, I'll be working and won't be able to go out.
//If it's a day and I have more than 10$. I will go to the cinema.
//If it's a day and I have less than 10$. or I don't have money, I'll go for a
//walk.
//If it is night and I have more than 20$. I will go to a disco.
//If it's night and I have less than 20$. I will go to sleep.
//Display the solution as a message in the console.

package L01.homework;

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time (between 0 and 24): ");
        int time = scanner.nextInt();

        System.out.print("Enter the amount of money: ");
        double money = scanner.nextDouble();

        System.out.print("Are you at work? (true/false): ");
        boolean isAtWork = scanner.nextBoolean();

        if (time >= 0 && time <= 24) {
            if (isAtWork) {
                System.out.println("I'm at work and will be working; can't go out.");
            } else if (time >= 6 && time < 18) { // It's daytime (6 AM to 6 PM)
                if (money > 10) {
                    System.out.println("It's a day, and I have more than $10, so I'll go to the cinema.");
                } else {
                    System.out.println("It's a day, and I have less than $10 or no money, so I'll go for a walk.");
                }
            } else { // It's nighttime
                if (money > 20) {
                    System.out.println("It's night, and I have more than $20, so I'll go to a disco.");
                } else {
                    System.out.println("It's night, and I have less than $20, so I'll go to sleep.");
                }
            }
        } else {
            System.out.println("Invalid time input. Please enter a time between 0 and 24.");
        }

        scanner.close();
    }
}
