/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		Card one = new Card("5", "Clubs", 5);
		Card two = new Card("2", "Spades", 3);
		Card three = new Card("5", "Clubs", 5);
  
		System.out.println("One matches two: " + one.matches(two));
		System.out.println("One matches three: " + one.matches(three));    
		System.out.println("Suit of Card One: " + one.suit());
		System.out.println("Card one: " + one.toString());
		System.out.println("Suit of Card Two: " + two.suit());
		System.out.println("Card two: " + two.toString());
		System.out.println("Suit of Card Three: " + three.suit());
		System.out.println("Card three: " + three.toString());
	}
}
