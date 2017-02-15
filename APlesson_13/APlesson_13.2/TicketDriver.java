public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket w = new Walkup();
		System.out.println("Walkup Ticket\n" + w);
		
		Ticket a = new Advance();
		System.out.println("\nAdvance Ticket\n" + a);
		
		Advance sa = new StudentAdvance();
		System.out.println("\nStudent Advance Ticket\n" + sa);	
	}
}