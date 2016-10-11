import java.util.Scanner;
public class GPACalc
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your math letter grade?");
		String grade1 = kb.next();
		
		System.out.println("What is your science letter grade?");
		String grade2 = kb.next();
		
		System.out.println("What is your english letter grade?");
		String grade3 = kb.next();
		
		System.out.println("What is your history letter grade?");
		String grade4 = kb.next();
		
		System.out.println("What is your foreign language letter grade?");
		String grade5 = kb.next();
		
		System.out.println("What is your first elective letter grade?");
		String grade6 = kb.next();
		
		System.out.println("What is your second elective letter grade?");
		String grade7 = kb.next();
		
		double GPA = (calcPoints(grade1) + calcPoints(grade2) + calcPoints(grade3) + calcPoints(grade4) + calcPoints(grade5) + calcPoints(grade6) + calcPoints(grade7)) / 7;
		
		System.out.printf("Your GPA is %1.2f ", GPA);
	}	
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		else if (grade.equals("B"))
			return 3.0;
		else if (grade.equals("C"))
			return 2.0;
		else if (grade.equals("D"))
			return 1.0;
		else
			return 0;
	}
}	