//Write a program to output to the console the multiplication table till 10.
//The program must avoid duplications.
//Example:
//Output:
//1*1; 1*2; 1*3; 1*4; 1*5; 1*6; 1*7; 1*8; 1*9; 1*10;
//2*2; 2*3; 2*4; 2*5; 2*6; 2*7; 2*8; 2*9; 2*10;
//3*3; 3*4; 3*5; 3*6; 3*7; 3*8; 3*9; 3*10;
//………………………………………….
//10*10;

package L02.homework;

public class Task15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                int result = i * j;
                System.out.print(i + "*" + j + "; ");
            }
            System.out.println();
        }
    }
}
