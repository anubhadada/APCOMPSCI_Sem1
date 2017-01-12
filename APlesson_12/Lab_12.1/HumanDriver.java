import java.util.Scanner;
public class HumanDriver
{
	public static void main (String[]args)
    {
	   Scanner kb = new Scanner(System.in);
	   
	   System.out.println("Enter your hair color: ");
	   String hair = kb.nextLine();
	   System.out.println("Enter your eye color: ");
	   String eyes = kb.nextLine();
	   System.out.println("Enter your skin color: ");
	   String skin = kb.nextLine();
	  
	   Human object = new Human(hair, eyes, skin);
	  
	   System.out.println("\nYour info...\nHair: " + object.getHair() 
	   + "\nEyes: " + object.getEyes() + "\nSkin: " + object.getSkin());
	   
	   object.setHES("brunette", "green", "tan");
	   System.out.println("\nFriend's info...\nHair: " + object.getHair() 
	   + "\nEyes: " + object.getEyes() + "\nSkin: " + object.getSkin());
    }
}