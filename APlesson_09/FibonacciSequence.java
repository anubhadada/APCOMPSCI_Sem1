import java.util.Scanner;
public class FibonacciSequence
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your starting number: ");
		int number = kb.nextInt();
		System.out.println("Please enter your sequence size: ");
		int sequence = kb.nextInt();
		
		int [] seq = new int[sequence];
	
		System.out.println("Sequence: ");
		for(int i = 0; i < seq.length; i++)
		{
			if(i==0 || i==1)
			{
				seq[i]= number;
			}
			else
			{
				seq[i] = seq[i-1] + seq[i-2];
			}
			System.out.println(seq[i]);
		}
		
	}

}	