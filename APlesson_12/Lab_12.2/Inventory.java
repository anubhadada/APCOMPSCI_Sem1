import java.util.Scanner;

public class Inventory
{
	private String manufacturer, name, category;
	private int UPC;
	private double price;
	
	public Inventory(String manu, String nam)
	{
		manufacturer = manu;
		name = nam;
		category = "food";
		price = 10.00;
		UPC = (int)(Math.random() * 1000000000);
	}
	
	public Inventory(String manu, String nam, String cat, double pri)
	{
		manufacturer = manu;
		name = nam;
		category = cat;
		price = pri;
		UPC = (int)(Math.random() * 1000000000);
	}
	public String toString()
	{
		return "\nItem Info...\nName: " + name +
				"\nCategory: " + category + "\nManufacturer: " + manufacturer 
				+ "\nPrice: " + price + "\nUPC#: " + UPC;
	}
}