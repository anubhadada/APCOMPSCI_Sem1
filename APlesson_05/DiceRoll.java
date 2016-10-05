import java.util.Random;
public class DiceRoll
{
		
	public static void main(String[]args)
	{
		Random rand = new Random();
		
		int player = rand.nextInt(6) + 1;
		int computer = rand.nextInt(6) + 1;
		
		String winner = RollDice(player, computer); 
		
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("The winner is..." + winner);
	
	}	
	
	public static String RollDice(int player, int computer)
	{
		String winner = "";
		if (player > computer)
			winner = "player!";
		
		if (computer > player)
			winner = "computer!";
		
		if (player == computer)
			winner = "neither, it was a tie!";
		
		return winner;
	}
}	