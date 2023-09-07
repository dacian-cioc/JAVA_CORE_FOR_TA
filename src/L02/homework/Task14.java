//Write a program to output to the console the multiplication table till 10.
//Example:
//Output:
//1 * 1 = 1
//1 * 2 = 2
//…………
//10 * 10 = 100

package L02.homework;

public class Task14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
        }
    }
}
