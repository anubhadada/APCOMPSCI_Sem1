import java.util.Scanner;
public class FindTheZs
{
	static String [] words = new String[5];
	
	public static void main(String[]args)
	{
		
		System.out.print("For the following words: " + " \n");
		fillArray();
		printArray();
		System.out.print("These words have a z: " + "\n");
		System.out.println(hasZs());

	}
	
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	
	public static void printArray()
	{
		for(String w : words)
		{
			System.out.println(w + " ");
		}
	}
	
	public static String hasZs()
	{
		String zs = "";
		for(String r : words)
		{
			if(r.indexOf("z") >= 0 || r.indexOf("Z") >= 0)
			{
				zs = zs + r + " ";
			}
		}
		return zs;
	}
}	