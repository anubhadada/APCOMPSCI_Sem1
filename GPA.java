import java.util.Scanner;

public class GPA
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your math percentage?");
		
		double math = kb.nextDouble();
		
		System.out.println("What is your science percentage?");
		
		double science = kb.nextDouble();
		
		System.out.println("What is your english percentage?");
		
		double english = kb.nextDouble();
		
		System.out.println("What is your history percentage?");
		
		double history = kb.nextDouble();
		
		System.out.println("What is your foreign language percentage?");
		
		double language = kb.nextDouble();
		
		System.out.println("What is your elective percentage?");
		
		double elective = kb.nextDouble();
		
		double averageGrade = (math + science + english + history + language + elective) / 6;
		
		System.out.println("Your average percentage is " + averageGrade);
	}
}