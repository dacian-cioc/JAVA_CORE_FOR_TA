//Write a program that finds and outputs the longest sequence of identical
//sequential elements in an array.
//Example:
//Input:
//[1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 7, 7, 7, 7, 7, 7, 8, 8, 9, 10]
//Output:
//7, 7, 7, 7, 7, 7

package L03.homework;

public class Task7 {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 7, 7, 7, 7, 7, 7, 8, 8, 9, 10};

        int longestStartIndex = 0;
        int longestLength = 1;

        int currentStartIndex = 0;
        int currentLength = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentLength++;

                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    longestStartIndex = currentStartIndex;
                }
            } else {
                currentStartIndex = i;
                currentLength = 1;
            }
        }

        // Output the longest sequence
        System.out.print("Longest sequence: ");
        for (int i = longestStartIndex; i < longestStartIndex + longestLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
