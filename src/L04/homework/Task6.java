//Write a program where the user must enter a string that contains letters and
//numbers.
//The program should output all the numbers from the string, as well as the sum
//of the numbers.
//Example:
//Input:
//test12ing45how-12this65works
//Output:
//12
//45
//-12
//65
//The sum of all numbers is: 110

package L04.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string containing letters and numbers: ");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("-?\\d+"); // Regular expression to match integers (including negative numbers)
        Matcher matcher = pattern.matcher(input);

        int sum = 0;

        System.out.println("Numbers in the string:");

        while (matcher.find()) {
            String numberStr = matcher.group();
            int number = Integer.parseInt(numberStr);
            System.out.println(number);
            sum += number;
        }

        System.out.println("The sum of all numbers is: " + sum);

        scanner.close();
    }
}
