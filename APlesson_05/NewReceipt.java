import java.util.Scanner;
public class NewReceipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		NewReceipt form = new NewReceipt();
		
		System.out.println("Please enter item 1");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price");
		double price1 = kb.nextDouble();
		kb.nextLine();
		
		
		System.out.println("Please enter item 2");
		String item2 = kb.nextLine();
		System.out.println("Please enter the price");
		double price2 = kb.nextDouble();
		kb.nextLine();
		
		
		System.out.println("Please enter item 3");
		String item3 = kb.nextLine();
		System.out.println("Please enter the price");
		double price3 = kb.nextDouble();
		kb.nextLine();
		
		
		System.out.println("Please enter item 4");
		String item4 = kb.nextLine();
		System.out.println("Please enter the price");
		double price4 = kb.nextDouble();
		kb.nextLine();
		
		
		System.out.println("<<<<<<<<<<<_Receipt_>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		form.format(item4, price4);
	
		
		double subtotal = price1 + price2 + price3 + price4;
		form.format("Subtotal:", subtotal);
		double disc = Discount(subtotal);
		
		double Discount = (0.15 * subtotal);
		form.format("Discount:", Discount);
		
		form.format("Total:", disc);
		
		double tax = (0.08 * disc);
		form.format("Tax:", tax);
		
		double total = tax + disc;
		form.format("Final Total:", total);
		
		System.out.printf("\n________________________________");
		System.out.printf("\n* Thank you for your support *");
	}
	
	public static double Discount(double subtotal)
	{
		double price = 0;
		if (subtotal >= 2000)
			price = subtotal - (0.15 * subtotal);
		
		if (subtotal <= 2000)
			price = subtotal;
		
		return price;
	}
	
	public void format(String item, double price)
	{
		System.out.printf("* %20s ........ %20.2f\n", item, price);
	}
}		