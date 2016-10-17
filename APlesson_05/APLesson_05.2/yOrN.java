import java.util.Scanner;
public class yOrN
{
	static Scanner kb;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		Recursion();
	}
	
	public static void Recursion()
	{
		System.out.println("Would you like to do some recursion?");
		String choice = kb.nextLine();
		
		if(choice.equals("Y")|| choice.equals("N"))
		{
			if(choice.equals("Y"))
				System.out.println("Yay! Let's do some recursion!");
			else
				System.out.println("You spolied the fun!");
		}
		else
		{
			System.out.println("Please enter Y or N");
			Recursion();
		}
	}
}
