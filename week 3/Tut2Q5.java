import java.util.*;

public class Tut2Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert 1st no: ");
        int num1 = scanner.nextInt();

        System.out.print("Insert 2nd no: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        int calculation;
        switch (op) {
            case '+':
                calculation = num1 + num2;
                System.out.println("Addition");
                break;
            case '-':
                calculation = num1 - num2;
                System.out.println("Subtraction");
                break;
            case '*':
                calculation = num1 * num2;
                System.out.println("Multiplication");
                break;
            case '/':
                if (num2 != 0) {
                    calculation = num1 / num2;
                    System.out.println("Division");
                } else {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Something invalid");
                return;
        }

        System.out.println("Calculation: " + calculation);
    }
}