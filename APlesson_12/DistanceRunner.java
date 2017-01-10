import java.util.Scanner;
public class DistanceRunner
{
	public static void main (String[]args)
    {
	   Scanner kb = new Scanner(System.in);
	   
	   System.out.println("Enter a value for xOne: ");
	   int xOne = kb.nextInt();
	   System.out.println("Enter a value for yOne: ");
	   int yOne = kb.nextInt();
	   System.out.println("Enter a value for xTwo: ");
	   int xTwo = kb.nextInt();
	   System.out.println("Enter a value for yTwo: ");
	   int yTwo = kb.nextInt();
	   
	   Distance object = new Distance(xOne, yOne, xTwo, yTwo);
	  
	   System.out.println("Distance = " + object.getDist());
	   
	   object.setValues(5, 4, 3, 2);
	   System.out.println("Distance = " + object.getDist());
    }
}