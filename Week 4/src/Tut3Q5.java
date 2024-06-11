import java.util.*;
public class Tut3Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number_1 = 0;
        double number_2 = 0;
        String operator = "";
        boolean validInput = false;

        // Input validation for the first number
        while (!validInput) {
            System.out.print("Enter the first number: ");
            if (scanner.hasNextDouble()) {
                number_1 = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        validInput = false;

        // Input validation for the second number
        while (!validInput) {
            System.out.print("Enter the second number: ");
            if (scanner.hasNextDouble()) {
                number_2 = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        validInput = false;

        // Input validation for the operator
        while (!validInput) {
            System.out.print("Enter the operator (+, -, *, /): ");
            operator = scanner.next();

            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                validInput = true;
            } else {
                System.out.println("Invalid operator. Please enter one of the following operators: +, -, *, /");
            }
        }

        // Performing the calculation and handling division by zero
        try {
            double result = 0;
            switch (operator) {
                case "+":
                    result = number_1 + number_2;
                    break;
                case "-":
                    result = number_1 - number_2;
                    break;
                case "*":
                    result = number_1 * number_2;
                    break;
                case "/":
                    if (number_2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = number_1 / number_2;
                    break;
            }
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
