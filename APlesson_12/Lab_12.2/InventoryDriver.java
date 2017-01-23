import java.util.Scanner;

public class InventoryDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter manufacturer: ");
		String manufacturer = kb.nextLine();
		
		System.out.println("Enter name: ");
		String name = kb.nextLine();
		
		System.out.println("Will you be entering category and price info?(y or n)");
		String yOrN = kb.next();
		
		if(yOrN.equals("n"))
		{
			Inventory pH = new Inventory(manufacturer, name);
			System.out.println(pH);
		}
		else if(yOrN.equals("y"))
		{
			System.out.println("Please enter the category: ");
			String category = kb.next();
			System.out.println("Please enter the price: ");
			Double price = kb.nextDouble();
			Inventory pH2 = new Inventory(manufacturer, name, category, price);
			System.out.println(pH2);
		}
	}
}	