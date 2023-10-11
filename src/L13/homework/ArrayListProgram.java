package L13.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = generateRandomNumbers(20, 0, 5000);
        displayArrayList(numbers);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search in the list: ");
        int searchNumber = scanner.nextInt();

        int index = numbers.indexOf(searchNumber);

        if (index != -1) {
            System.out.println("The number " + searchNumber + " is at index " + index + " in the list.");
        } else {
            System.out.println("The number " + searchNumber + " is not in the list.");
        }

        int minNumber = Collections.min(numbers);
        int maxNumber = Collections.max(numbers);

        System.out.println("Minimum number in the list: " + minNumber);
        System.out.println("Maximum number in the list: " + maxNumber);

        scanner.close();
    }

    private static ArrayList<Integer> generateRandomNumbers(int size, int min, int max) {
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int randomNumber = (int) (Math.random() * (max - min + 1) + min);
            randomNumbers.add(randomNumber);
        }

        return randomNumbers;
    }

    private static void displayArrayList(ArrayList<Integer> list) {
        System.out.println("Random numbers in the list:");
        for (int number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
