import java.util.*;

public class ExerciseFiveTwo {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length in meters: ");
        int meters = input.nextInt();
        int centimeters = meters*100;
        System.out.println("Length in centimeters : " + centimeters);

    }
}