import java.util. *;

public class Second {
	public static void main (String[] args) 
	{
		Scanner input = new Scanner (System.in) ;
		System.out.println ("Insert your name:") ;
		String name = input.next () ;
		String surname = input.next() ;
		System.out.println ("Hello: " + name + " " + surname) ;
	}
}