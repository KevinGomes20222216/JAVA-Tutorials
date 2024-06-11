import java.util.*;
public class Week4LecProblem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define arrays to hold names and test scores
        String[] names = {"Binu Bandara", "Kevin Gomes", "Sachira Delankawala"};
        double[] scores = new double[names.length];

        // Read test scores for each student
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the score for " + names[i] + ": ");
            scores[i] = scanner.nextDouble();
        }

        // Compute overall average
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        double average = sum / scores.length;
        System.out.println("\nAverage = " + average);

        // Print summary with names, scores, and deviation from the average
        System.out.println("\nSummary:");
        for (int i = 0; i < names.length; i++) {
            double deviation = scores[i] - average;
            System.out.printf("%-20s Score: %.2f  Deviation: %.2f%n", names[i], scores[i], deviation);
        }

        scanner.close();
    }
}