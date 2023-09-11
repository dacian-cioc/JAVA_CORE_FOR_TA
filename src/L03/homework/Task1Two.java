package L03.homework;

public class Task1Two {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 2, 7, 10, 14, 55, 17, 25, 15, 12};

        int largestMultipleOf5 = findLargestMultipleOf5(array);

        if (largestMultipleOf5 != Integer.MIN_VALUE) {
            System.out.println("Largest number multiple of 5 in the array: " + largestMultipleOf5);
        } else {
            System.out.println("No multiple of 5 found in the array.");
        }
    }

    // Helper function to find the largest number multiple of 5 in the array
    private static int findLargestMultipleOf5(int[] array) {
        int largestMultipleOf5 = Integer.MIN_VALUE;

        for (int number : array) {
            if (number % 5 == 0 && number > largestMultipleOf5) {
                largestMultipleOf5 = number;
            }
        }

        return largestMultipleOf5;
    }
}
