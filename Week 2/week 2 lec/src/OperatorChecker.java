import java.util.*;
public class OperatorChecker {
    public static void main(String[] args){
        Scanner operator = new Scanner(System.in);
        System.out.println("Enter a operator of these '+,-,/'");
        char op = operator.next().charAt(0);
        if(op=='+') {
            System.out.println("Addition");
        }
        else if(op == '*') {
            System.out.println("Multiplication");
        }
        else if(op == '-') {
            System.out.println("Subtraction");
        }
        else System.out.println("Invalid Operator");
        }
    }
