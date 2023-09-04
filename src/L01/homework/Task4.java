//Please enter 3 numbers from the console (keyboard) - A, B and C.
//Swap their values in such a way that A takes B's value, B takes C's value and C
//takes A's old value.

package L01.homework;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        int A = scanner.nextInt();

        System.out.print("Enter the value of B: ");
        int B = scanner.nextInt();

        System.out.print("Enter the value of C: ");
        int C = scanner.nextInt();

        // Swap the values using a temporary variable
        int temp = A;
        A = B;
        B = C;
        C = temp;

        System.out.println("After swapping:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);

        scanner.close();
    }
}
