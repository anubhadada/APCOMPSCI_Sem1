import java.util.Scanner;
public class Rectangle
{
	static double length;
	static double width;
	static double perim;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a length:");
		length = kb.nextDouble();
		System.out.println("Please enter a width:");
		width = kb.nextDouble();
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perim = 2*length + 2*width;
	}
	
	public static void print()
	{
		System.out.printf("Your rectangle is %10.5f", perim, " ft around");
	}
	 
}