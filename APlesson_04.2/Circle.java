import java.util.Scanner;
public class Circle
{
	static double r;
	static double a;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a radius length:");
		r = kb.nextDouble();
		print();
	}
	
	public static double calcArea()
	{
		return(3.14*(r*r));
	}
	
	public static void print()
	{
		System.out.println("The area of your circle is " + calcArea());
	}
}