import java.util.Scanner;

public class BMIPart2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your height in inches?");
		
		double height = kb.nextDouble();
		
		System.out.println("What is your weight in pounds?");
		
		double weight = kb.nextDouble();
		
		calcBMI(weight, height);
	}	
	
	public static void calcBMI(double weight, double height)
	{
		double BMI = (weight / (height * height)) * 703;
		String condition = "";
		
		if (BMI < 18.5)
			condition = "Underweight";
		else if (BMI <= 24.9)
			condition = "Normal";
		else if (BMI <= 29.9)
			condition = "Overweight";
		else if (BMI <= 34.9)
			condition = "Obese";
		else if (BMI <= 39.9)
			condition = "Very Obese";
		else
			condition = "Morbidly Obese";
		
		System.out.printf("Your BMI is %1.2f ", BMI);
		System.out.println("\nYou are " + condition);
	}
}