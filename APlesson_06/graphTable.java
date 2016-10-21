import java.util.Scanner;
public class graphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = kb.nextInt();
		
		System.out.println("Enter the size of your table: ");
		int tableSize = kb.nextInt();
		
		for(int i = 1; i <= tableSize; i++)
		{
			System.out.printf("%5s | %1s\n", i, (i*number));
		}
	}
}	