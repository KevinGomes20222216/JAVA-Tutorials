import java.util.Scanner;
public class Tut4Q5 {
    public static void main(String[] args) {
        double[][] marks = new double[5][3];
        Scanner scanner = new Scanner(System.in);

        // Read marks from the user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextDouble();
            }
        }

        // Calculate and print the average for each student
        for (int i = 0; i < 5; i++) {
            double sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += marks[i][j];
            }
            double average = sum / 3;
            System.out.println("Average for student " + (i + 1) + ": " + average);
        }
    }
}