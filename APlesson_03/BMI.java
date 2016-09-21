import java.util.Scanner;

public class BMI
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your height?");
		
		double height = kb.nextDouble();
		
		System.out.println("What is your weight?");
		
		double weight = kb.nextDouble();
		
		double BMI = (weight / (height * height)) * 703;
		
		System.out.println("Your BMI is " + BMI);
		
	}
	
}