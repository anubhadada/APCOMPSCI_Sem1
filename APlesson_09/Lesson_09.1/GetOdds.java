public class GetOdds
{
	static int [] numbers = new int[10];
	
	public static void main(String[]args)
	{
		System.out.print("For the following numbers: " + " \n");
		fillArray();
		printArray();
		System.out.print("Odd numbers: " + "\n");
		getOdds();

	}
	
	public static void fillArray()
	{
		for(int i = 0; i < 10; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
	}
	
	public static void printArray()
	{
		for(int n : numbers)
		{
			System.out.println(n + " ");
		}
	}
	
	public static void getOdds()
	{
		for(int r : numbers)
		{
			if(r % 2 != 0)
			{
				System.out.print(r + " ");
			}
		}
	}
}	