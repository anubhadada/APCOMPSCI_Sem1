import java.util.Scanner;

public class MPHRunner
{
   public static void main (String[]args)
   {
	   Scanner kb = new Scanner(System.in);
	   
	   System.out.println("Enter a Distance: ");
	   int distance = kb.nextInt();
	   System.out.println("Enter the number of Hours: ");
	   int hours = kb.nextInt();
	   System.out.println("Enter the number of minutes: ");
	   int minutes = kb.nextInt();
	   
	   MPH object = new MPH(distance, hours, minutes);
	  
	   System.out.println(object.getDistance() + " miles in " + object.getHours() 
	   + " hours and " + object.getMins() + " minutes = " + object.getMPH() + " mph");
	   
	   object.setValues(200, 5, 0);
	   System.out.println(object.getDistance() + " miles in " + object.getHours() 
	   + " hours and " + object.getMins() + " minutes = " + object.getMPH() + " mph");
   }
}