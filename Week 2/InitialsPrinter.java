import java.util.*;

public class InitialsPrinter {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        String initial1 = name.substring(0, 1).toUpperCase();
        String initial2 = surname.substring(0, 1).toUpperCase();

        System.out.println("Your initials are: " + initial1 + initial2);
    }
}