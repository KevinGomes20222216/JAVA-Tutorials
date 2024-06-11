public class Tut4Q2 {
    public static void main(String[] args) {
        String[] array = {"Alex", "Max", "Charlie", "Bob", "Ada", "Jim"};

        // Print the original array
        System.out.println("Original array: ");
        printArray(array);

        // Swap elements at indices 2 and 4
        int index1 = 2;
        int index2 = 4;
        swapElements(array, index1, index2);

        // Print the modified array
        System.out.println("\nArray after swapping elements at indices " + index1 + " and " + index2 + ": ");
        printArray(array);
    }

    // Method to swap elements at given indices
    public static void swapElements(String[] array, int index1, int index2) {
        // Check if indices are valid
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            System.out.println("Invalid indices!");
            return;
        }

        // Swap elements
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Method to print the array
    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
    }
}