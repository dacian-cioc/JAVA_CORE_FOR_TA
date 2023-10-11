//Write a program which creates a concordance of characters occurring in a string
//(i.e., which characters occur where in a string). Read the string from the
//command line (by the user).
//Example:
//Input:
//Hello World
//Output:
//{d=[10], o=[4, 7], r=[8], W=[6], H=[0], l=[2, 3, 9], e=[1]}

package L13.homework;

import java.util.*;

public class ConcordanceProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string:");
        String inputString = scanner.nextLine();

        scanner.close();

        Map<Character, List<Integer>> concordance = createConcordance(inputString);

        displayConcordance(concordance);
    }

    private static Map<Character, List<Integer>> createConcordance(String input) {
        Map<Character, List<Integer>> concordance = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Ignore spaces
            if (currentChar != ' ') {
                concordance.computeIfAbsent(currentChar, k -> new ArrayList<>()).add(i);
            }
        }

        return concordance;
    }

    private static void displayConcordance(Map<Character, List<Integer>> concordance) {
        System.out.println("Output:");

        for (Map.Entry<Character, List<Integer>> entry : concordance.entrySet()) {
            char character = entry.getKey();
            List<Integer> occurrences = entry.getValue();

            System.out.println(character + "=" + occurrences);
        }
    }
}
