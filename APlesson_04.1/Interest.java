import java.util.Scanner;

public class Interest
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Interest form = new Interest();
		
		System.out.println("What is the principal amount you intend to borrow?");
		double p = kb.nextDouble();
		
		System.out.println("What is your interest rate?");
		double r = kb.nextDouble();
		
		System.out.println("How many times is your loan compounded every year?");
		double n = kb.nextDouble();
		
		System.out.println("What is the life of your loan, in years?");
		double t = kb.nextDouble();
		
		double total = form.payment(r, p, n, t);
		
		System.out.println("Your monthly payment is $" + total);
		
	}
		public double payment(double r, double p, double n, double t)
		{
			return (p*(Math.pow(1 + r/n, n*t)))/(t*12);
		}
}