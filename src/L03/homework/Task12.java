//You have a 7x7 two-dimensional array of natural numbers whose values are preentered.
//Write a program that finds and print in the console the smallest and the
//largest element from this array.
//Example:
//Input:
//48,72,13,14,15,43,19
//21,22,53,24,75,48,17
//31,57,33,34,35,63,12
//41,95,43,44,45,91,50
//59,52,53,54,55,14,32
//61,69,63,64,65,81,15
//42,32,12,26,59,67,97
//Output:
//The smallest number is: 12
//The largest number is: 97

package L03.homework;
public class Task12 {
    public static void main(String[] args) {
        int[][] array = {
                {48,72,13,14,15,43,19},
                {21,22,53,24,75,48,17},
                {31,57,33,34,35,63,12},
                {41,95,43,44,45,91,50},
                {59,52,53,54,55,14,32},
                {61,69,63,64,65,81,15},
                {42,32,12,26,59,67,97}
        };

        int smallest = array[0][0];
        int largest = array[0][0];

        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt < smallest) {
                    smallest = anInt;
                }
                if (anInt > largest) {
                    largest = anInt;
                }
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}
