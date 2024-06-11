import java.util.*;
public class Tut2Q2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter ur age");
        int number = s.nextInt();

        if (number < 0){
            System.out.println("the age entered is incorrect");
        }
        else if(number < 18){
            System.out.println("Below 18");
        }
        else if(number >= 18){
            System.out.println("Over 18");
        }
    }
}
