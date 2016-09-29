import java.util.Scanner;
public class Rectangle
{
	static double length;
	static double width;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a length:");
		length = kb.nextDouble();
		System.out.println("Please enter a width:");
		width = kb.nextDouble();
		print();
	}
	
	public static double calcPerim()
	{
		return (2*length + 2*width);
	}
	
	public static void print()
	{
		System.out.println("Your rectangle is " + calcPerim() + " ft around");
	}
	 
}