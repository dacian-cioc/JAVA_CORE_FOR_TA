//Write a program that accepts two integers from the user.
//The program calls the getTotal() method, which takes two integers and returns
//their sum.
//Store the result in a variable and print to the console.

package L04.homework;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Call the getTotal() method to calculate the sum
        int sum = getTotal(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();
    }

    // Method to calculate the sum of two integers
    public static int getTotal(int a, int b) {
        return a + b;
    }
}
