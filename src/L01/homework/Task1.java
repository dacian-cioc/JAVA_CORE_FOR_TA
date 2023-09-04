//Read (as input) 3 numbers from the keyboard: A, B & C. The numbers are with
//floating point (double).
//Check whether the number C is between A and B.
//As output, you must display to the user an appropriate message about whether
//the number C is between the numbers A and B.

package L01.homework;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number A: ");
        double A = scanner.nextDouble();

        System.out.print("Enter number B: ");
        double B = scanner.nextDouble();

        System.out.print("Enter number C: ");
        double C = scanner.nextDouble();

        if (C > A && C < B) {
            System.out.println("Number " + C + " is between " + A + " and " + B);
        } else if (C > B && C < A) {
            System.out.println("Number " + C + " is between " + B + " and " + A);
        } else {
            System.out.println("Number " + C + " is not between " + Math.min(A, B) + " and " + Math.max(A, B));
        }

        scanner.close();
    }
}
