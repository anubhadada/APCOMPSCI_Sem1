import java.util.Scanner;
public class AdventureStory
{
	static Scanner kb;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		Adventure();
	}
	
	public static void Adventure()
	{
		System.out.println("You are in the woods. There are two paths.");
		System.out.println("Would you like to..." + 
							"\n1. Go left" + 
							"\n2. Go right");
		int choiceA = kb.nextInt();
		if(choiceA == 1)
		{
			System.out.println("OK. You are going left.");
			System.out.println("You see a snake. Would you like to..." +
								"\n1. Run away" + 
								"\n2. Make friends");
			int choiceB = kb.nextInt();	
			if(choiceB == 1)
			{
				System.out.println("OK. You are running away from the snake. You find some magical beans on the ground.");
				System.out.println("Would you like to..." +
									"\n1. Pick the beans up and take them" +
									"\n2. Walk away and end the adventure");
				int choiceC = kb.nextInt();
				if(choiceC == 1)
				{
					System.out.println("Congratulations! The magical beans are a good luck charm and have made you rich and powerful! You will live a great life!");
					System.out.println("The adventure is over.");
				}
				else
					System.out.println("OK. The adventure is now over.");
			}
			else
			{
				System.out.println("The snake is very friendly! He is now your companion on this adventure.");
				System.out.println("You see an poor old man begging for food. Would you like to..." +
																			"\n1. Give the man some food" +
																			"\n2. Ignore the man and walk away and end the adventure");
				int choicea = kb.nextInt();
				if(choicea == 1)
				{
					System.out.println("OK. You give the man some bread and cheese.");
					System.out.println("The old man turned out to be a powerful wizard in disguise! He is happy to see you being generous! He gives you 1000 gold coins!");
					System.out.println("Congratulations! You have reached the end of the adventure.");
				}
				else
				{
					System.out.println("OK. You ignored the man and have walked away. The adventure is now over.");
				}
			}
		}	
		else
		{
			System.out.println("OK. You are going right.");
			System.out.println("You reach a lake with a waterfall. Would you like to..." + 
								"\n1. Jump in the lake and swim" +
								"\n2. Walk away");
			int choiceb = kb.nextInt();
			if(choiceb == 1)
			{
				System.out.println("OK. You jump into the lake, but the water is freezing and you get out of the water. You are now hungry.");
				System.out.println("Would you like to..." +
									"\n1. Eat some tasty looking berries from a nearby shrub" +
									"\n2. Ask a nearby person for some food");
				int choicec = kb.nextInt();
				if(choicec == 1)
				{
					System.out.println("OK. You pick some berries and eat them. Unfortunately, they turn out to be poisonous and you die.");
					System.out.println("You have reached the end of the adventure.");
				}
				else
				{
					System.out.println("OK. You ask an old man for food and he gives you what he claims to be magical bread.");
					System.out.println("The bread makes you powerful and you gain magical powers!");
					System.out.println("Congratulations! You have survived the adventure and have magical powers for the rest of your life!");
				}
			}
			else
			{
				System.out.println("OK. You walk away and run into someone's camp. They are very rich and there are sacks of gold on the ground.");
				System.out.println("Would you like to..." +
									"\n1. Steal the gold and run" +
									"\n2. Try and find the owner");
				int choiced = kb.nextInt();
				if(choiced == 1)
				{
					System.out.println("OK. You pick up the sacks of gold and are about to leave when an man emerges from behind a nearby tree");
					System.out.println("Uh oh! He must be the owner of the gold. He looks angry...");
					System.out.println("The owner turns out to have magical powers and he paralyzes you as a punishent for trying to steal his gold.");
					System.out.println("You are paralyzed for the rest of your life. Sad. Maybe that will teaach you not to steal in the future.");
					System.out.println("The adventure is now over.");
				}
				else
				{
					System.out.println("OK. You look for the owner and find someone sleeping behind a tree. You wake the owner and tell him to hide his riches so that no one steals them.");
					System.out.println("The owner is so thankful and happy that he decides to give you 2 sacks of gold!");
					System.out.println("Congratulations! You will be rich for the rest of your life.");
					System.out.println("You have reached the end of the adventure.");
				}
			}
		}			
	}
}	