import java.util.Scanner;

public class Subwoofers
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Subwoofers form = new Subwoofers();

		System.out.println("What is the height in inches?");
		double height = kb.nextDouble();
		
		System.out.println("What is the length in inches?");
		double length = kb.nextDouble();
		
		System.out.println("What is the width in inches?");
		double width = kb.nextDouble();
		
		double volume = form.calcVol(height, length, width);
		
		double cubicVol = (height*length*width)/1728;
		
		System.out.println("Your volume is " + cubicVol);
	
	}
	
	public double calcVol(double height, double length, double width)
	{
		return (height*length*width);
	}
}
