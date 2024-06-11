import java.util. *;

public class Tut2Q1{
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in) ;
        System.out.println ("Insert 1st no:") ;
        double first = input.nextDouble();

        Scanner input2= new Scanner (System.in) ;
        System.out.println ("Insert 2nd no:") ;
        double second = input2.nextDouble();
        System.out.println (first + second);
    }
}