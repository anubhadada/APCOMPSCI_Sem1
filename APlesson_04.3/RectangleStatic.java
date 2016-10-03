import java.util.Scanner;
public class RectangleStatic
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
		System.out.printf("Your rectangle is %10.5f", calcPerim(), " ft around");
	}
	
	public static double calcPerim()
	{
		return 2*length + 2*width;
	}
	
}