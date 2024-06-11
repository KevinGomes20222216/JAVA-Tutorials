import java.util.*;
public class Tut3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        int factorial = 1;

        if (number == 0) {
            System.out.println("Factorial of 0 is 1.");
        } else {
            System.out.print("Factorial of " + number + " = ");

            for (int i = number; i >= 1; i--) {
                if (i == number) {
                    System.out.print(i);
                } else {
                    System.out.print(" x " + i);
                }
                factorial *= i;
            }

            System.out.println(" = " + factorial);
        }

        scanner.close();
    }
}