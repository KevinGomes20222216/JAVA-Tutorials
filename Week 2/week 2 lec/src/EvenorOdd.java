import java.util.*;
public class EvenorOdd {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int number = s.nextInt();
        if(number%2==0){
            System.out.println("This is a even number");
        }
        else{
            System.out.println("Not a even number");
        }
    }
}
