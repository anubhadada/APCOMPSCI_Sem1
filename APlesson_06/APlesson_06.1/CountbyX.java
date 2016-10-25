import java.util.Scanner;
public class CountbyX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the end number: ");
		int end = kb.nextInt();
		System.out.println("Please enter the interval: ");
		int interval = kb.nextInt();
		
		for(int i = 0; i <= end; i+=interval)
		{
			System.out.print(i + "\t");
		}
	}
}