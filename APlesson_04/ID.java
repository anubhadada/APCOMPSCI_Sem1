import java.util.Scanner;

public class ID
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		ID card = new ID();
		
		System.out.println("Enter your first name");
		String name2 = kb.nextLine();
		
		System.out.println("Enter your last name");
		String info2 = kb.nextLine();
		
		System.out.println("Enter your title");
		String name3 = kb.nextLine();
		
		System.out.println("Enter the school site");
		String name1 = kb.nextLine();
		
		System.out.println("Enter the school year");
		String info1 = kb.nextLine();
		
		System.out.println("What is your subject?");
		String info3 = kb.nextLine();
		
		
		System.out.println("********************************************");
		card.format(name1, info1);
		card.format(name2, info2);
		card.format(name3, info3);
		System.out.println("********************************************");
	}
	public void format(String name, String info)
	{
		System.out.printf("* %15s          %15s *\n", name, info);
	}
}