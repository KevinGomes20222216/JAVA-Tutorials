import java.util.Arrays;
import java.util.Scanner;
public class Tut4Q3 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        Scanner scanner = new Scanner(System.in);

        // Fill the array with double values
        System.out.println("Enter 10 double values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextDouble();
        }

        System.out.println("Initial array: " + Arrays.toString(arr));

        // Get user input for indices i and j
        System.out.print("Enter i: ");
        int i = scanner.nextInt();
        System.out.print("Enter j: ");
        int j = scanner.nextInt();

        // Swap the values at positions i and j
        swapValues(arr, i, j);

        System.out.println("Array after swapping: " + Arrays.toString(arr));
    }

    public static void swapValues(double[] arr, int i, int j) {
        // Check if i and j are valid indices
        if (i >= 0 && i < arr.length && j >= 0 && j < arr.length) {
            // Swap the values at positions i and j
            double temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        } else {
            System.out.println("Invalid indices: i = " + i + ", j = " + j);
        }
    }
}