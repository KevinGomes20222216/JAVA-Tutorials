import java.util.*;
public class Tut3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of times to print the letter
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Get the letter to print
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);

        System.out.print("Output: ");

        // Print the letter n times
        int i = 0;
        while (i < n) {
            System.out.print(letter);
            i++;
        }

        scanner.close();
    }
}