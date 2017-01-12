import java.util.Scanner;
public class CarDriver
{
	public static void main (String[]args)
    {
	   Scanner kb = new Scanner(System.in);
	   
	   System.out.println("Enter a paint color: ");
	   String paint = kb.nextLine();
	   System.out.println("Enter an interior type: ");
	   String interior = kb.nextLine();
	   System.out.println("Enter an engine type: ");
	   String engine = kb.nextLine();
	   System.out.println("Enter a tire type: ");
	   String tires = kb.nextLine();
	   
	   Car object = new Car(paint, interior, engine, tires);
	  
	   System.out.println("\nYour vehicle is ready...\nPaint: " + object.getPaint() 
	   + "\nInterior: " + object.getInterior() + "\nEngine: " + object.getEngine() 
	   + "\nTires: " + object.getTires());
    }
}