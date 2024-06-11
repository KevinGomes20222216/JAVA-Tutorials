import java.util. *;

public class Tut2Q3{
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in) ;
        System.out.println ("Insert your ICT marks:") ;
        double ICT = input.nextDouble();

        Scanner input2= new Scanner (System.in) ;
        System.out.println ("Insert your CW marks:") ;
        double CW = input2.nextDouble();
        double Sum = ((ICT + CW) / 2) ;

        if (ICT > 30 || CW > 30){
            System.out.println("pass");
        }
        else if(Sum > 30){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}