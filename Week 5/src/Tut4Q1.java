import java.util.Scanner;
public class Tut4Q1 {
    public static void main(String[] args) {
        int[] marks = new int[6]; // a. Create an array of integers with size 6
        Scanner scanner = new Scanner(System.in);

        // b. Prompt the user to enter 6 marks and store them in the array
        System.out.println("Enter 6 marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }

        // c. Display the values in the array using enhanced for loop
        System.out.println("Marks entered:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();

        // d. Calculate the number of students who have failed (mark lower than 40) and the average mark
        int failedCount = 0;
        int totalMarks = 0;
        for (int mark : marks) {
            if (mark < 40) {
                failedCount++;
            }
            totalMarks += mark;
        }
        double averageMark = (double) totalMarks / marks.length;

        // e. Print the number of students who have failed and the average mark
        System.out.println("Number of students who failed: " + failedCount);
        System.out.println("Average mark: " + averageMark);
    }
}