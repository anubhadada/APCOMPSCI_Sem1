import java.util.Scanner;
public class Password
{
	static Scanner kb;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		String username = "ABhadada";
		String password = "12345";
		passCheck();
	}
	
	public static void passCheck()
	{
		System.out.println("Please enter your username: ");
		String username = kb.nextLine();
		System.out.println("Please enter your password: ");
		String password = kb.nextLine();
		
		if(username.equals("ABhadada") && password.equals("12345"))
		{
				System.out.println("You are granted access!");
		}
		else 
		{
			if(username.equals("ABhadada"))
			{
				System.out.println("Your password is incorrect!");
				passCheck();
			}
			else if(password.equals("12345"))
			{
				System.out.println("Your username is incorrect!");
				passCheck();
			}
			else
			{
				System.out.println("Your username and password are incorrect!");
				passCheck();
			}
		}
	}
}	