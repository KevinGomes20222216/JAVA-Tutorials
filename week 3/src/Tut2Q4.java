import java.util.*;

public class Tut2Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the grade: ");
        int grade = scanner.nextInt();

        String classification;

        if (grade < 0 || grade > 100) {
            classification = "Invalid value";
        }
        else if (grade >= 70) {
            if (grade >= 100) {
                classification = "Invalid value";
            } else {
                classification = "1st Class Honours (1)";
            }
        } else if (grade >= 60) {
            classification = "2+ Class Honours Upper Division (2:1)";
        } else if (grade >= 50) {
            classification = "2- Class Honours Lower Division (2:2)";
        } else if (grade >= 40) {
            classification = "3rd Class Honours (3)";
        } else {
            classification = "Invalid value";
        }

        System.out.println("Classification: " + classification);
    }
}