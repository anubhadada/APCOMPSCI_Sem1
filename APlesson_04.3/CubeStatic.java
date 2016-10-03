import java.util.Scanner;
public class CubeStatic
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a side length:");
		side = kb.nextDouble();
		calcSurf();
		System.out.printf("The surface area of your cube whose sides are " + side + " in length is: %10.5f", calcSurf());
	}
	
	public static double calcSurf()
	{
		return ((side*side)*6);
	}
	
}