package L13.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterFrequencyAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String inputText = scanner.nextLine();

        Map<Character, Integer> frequencyMap = analyzeLetterFrequency(inputText);

        displayResults(inputText, frequencyMap);

        scanner.close();
    }

    private static Map<Character, Integer> analyzeLetterFrequency(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Remove non-alphabetic characters and convert to lowercase
        text = text.replaceAll("[^a-zA-Z]", "").toUpperCase();

        // Count letter occurrences
        for (char letter : text.toCharArray()) {
            frequencyMap.put(letter, frequencyMap.getOrDefault(letter, 0) + 1);
        }

        return frequencyMap;
    }

    private static void displayResults(String text, Map<Character, Integer> frequencyMap) {
        System.out.println("Letter Frequency Analysis:");

        frequencyMap.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> {
                    char letter = entry.getKey();
                    int occurrences = entry.getValue();
                    double percentage = (occurrences * 100.0) / text.length();

                    System.out.printf("%c: %d occurrences (%.2f%%) - %s%n",
                            letter, occurrences, percentage, generateGraph(percentage));
                });
    }

    private static String generateGraph(double percentage) {
        int numberOfHashes = (int) (percentage / 2); // Using '#' to represent 2%

        return "#".repeat(Math.max(0, numberOfHashes));
    }
}
