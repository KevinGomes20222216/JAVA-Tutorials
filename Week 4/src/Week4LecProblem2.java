import java.util.*;
public class Week4LecProblem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Displaying array elements");

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}