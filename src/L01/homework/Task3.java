//Please enter 2 different numbers from the console (keyboard).
//As output, they should be printed in ascending order.
//And then they should be printed in descending order as well.

package L01.homework;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Ascending order
        if (num1 < num2) {
            System.out.println("Ascending order: " + num1 + ", " + num2);
        } else {
            System.out.println("Ascending order: " + num2 + ", " + num1);
        }

        // Descending order
        if (num1 > num2) {
            System.out.println("Descending order: " + num1 + ", " + num2);
        } else {
            System.out.println("Descending order: " + num2 + ", " + num1);
        }

        scanner.close();
    }
}
