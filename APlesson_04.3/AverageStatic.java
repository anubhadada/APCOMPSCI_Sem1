import java.util.Scanner;
public class AverageStatic
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number:");
		num1 = kb.nextDouble();
		System.out.println("Please enter a second number:");
		num2 = kb.nextDouble();
		System.out.println("Please enter a third number:");
		num3 = kb.nextDouble();
		average();
		System.out.printf("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: %10.5f", average());
	}
	
	public static double average()
	{
		return (num1 + num2 + num3)/3;
	}
	
}