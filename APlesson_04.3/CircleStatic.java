import java.util.Scanner;
public class CircleStatic
{
	static double r;
	static double a;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a radius length:");
		r = kb.nextDouble();
		calcArea();
		System.out.printf("The area of your circle with a radius of " + r + " is: %10.5f", calcArea());
	}
	
	public static double calcArea()
	{
		return (3.14*(r*r));
	}
	
}