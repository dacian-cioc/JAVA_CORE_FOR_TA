//Write a program that creates an array with 10 elements and initializes each of
//the elements with a value equal to the index of the element multiplied by 4. Print
//the array in the console.
//Example:
//Output:
//[0, 4, 8, 12, 16, 20, 24, 28, 32, 36]

package L03.homework;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 4;
        }

        // Display the array
        System.out.print("Array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
