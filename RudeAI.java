import java.util.Scanner;

public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Hi, my name is RudeAI.\nI'd like to ask you a few questions.");
		
		System.out.println("What is your name?");
		
		String name = kb.nextLine();
		
		System.out.println(name + "!!! Why would anyone name a baby like that?");
		
		System.out.println("How old are you?");
		
		String age = kb.nextLine();
		
		System.out.println("Oooooh!!!" + age + " is getting up there.");
		
		System.out.println("What do you do for fun " + name + "?");
		
		String fun = kb.nextLine();
		
		System.out.println("I thought only nerds like to " + fun + "?");
		
		System.out.println("What kind of music do you like?");
		
		String music = kb.nextLine();
		
		System.out.println("Boooo!!! I wouldn't wish the sound of " + music + " on my worst enemy.");
		
		System.out.println("How many siblings do you have?");
		
		int siblings = kb.nextInt();
		
		System.out.println(siblings + "? Wow, I hope the rest of your family is better looking.");
		
		System.out.println("What do you want to be when you grow up?");
		
		String occupation = kb.nextLine();
		
		kb.nextLine();
		
		System.out.println("So " + name + ", you're " + age + "...\nYou like to " + fun + " and listen to " + music + "...\nI'm only kiddin' " + name + ".");
		
		
	}
}