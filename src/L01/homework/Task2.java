// Please enter 2 different integers from the console (keyboard).
//Record their sum, difference, product, remainder of division and integer division in separate variables.
//At the end, please print the results to the console.
//Do the same, but with numbers that are floating point.

package L01.homework;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String newline = System.lineSeparator();

        //integer numbers

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int remainder = num1 % num2;
        int division = num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Remainder of division: " + remainder);
        System.out.println("Integer division: " + division + newline);

        //floating numbers

        System.out.print("Enter the first floating-point number: ");
        double num3 = scanner.nextDouble();

        System.out.print("Enter the second floating-point number: ");
        double num4 = scanner.nextDouble();

        double sum2 = num3 + num4;
        double difference2 = num3 - num4;
        double product2 = num3 * num4;
        double division2 = num3 / num4;

        System.out.println("Sum: " + sum2);
        System.out.println("Difference: " + difference2);
        System.out.println("Product: " + product2);
        System.out.println("Division: " + division2);

        scanner.close();
    }
}
