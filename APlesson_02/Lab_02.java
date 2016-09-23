public class Lab_02
{
	public static void main(String[]args)
	{
		int a = 5;
		int b = 10;
		int mult = a * b;
		
		System.out.println("5 multiplied by 10 is " + mult);
	
		String name = "Anu Bhadada ";
		String address = "13531 Candy Tuft Path ";
		String city = "San Diego, CA";
		String zip = "-92130";
		
		System.out.println("\n" + name + "\n" + address + "\n" + city + zip);
		
		int l = 5;
		int w = 3;
		int h = 6;
		int surfaceArea = 2 * (w * l + h * l + h * w);
		
		System.out.println("\nThe surface area of your rectangular prism is " + surfaceArea);
	}
}