import java.util.ArrayList;
import java.util.Scanner;

public class Main
	{
        private static String name;
        private static int handvalue;
        private static ArrayList <Cards>hand;
		public static void main(String[] args)
			{
             greeting();
             Deck.fillArray();
             playGame();
			}
		public static void greeting()
		    {
		    Scanner userInput = new Scanner (System.in);
			System.out.println("Hello, What is your name?");
			name = userInput.nextLine();
			System.out.println("Hello " + name + ", lets play some Blackjack!");
		    }
		public static void playGame()
		    {
		    Dealer dealer = new Dealer();
		    ArrayList <Cards> hand = new ArrayList<>();
		    hand.add(Deck.deck.get(0));
		    hand.add(Deck.deck.get(1));		        	
		    System.out.println("Here is your hand: ");
		    for (Cards c : hand)
		    	{
		        System.out.println(c.getSuits() + " of " + c.getRank());
		    	}
		    int handValue = hand.get(0).getValue() + hand.get(1).getValue();
		    System.out.println("Here is the total: " + handValue);
		    
		    if (handValue==21)
		    	{
		    	System.out.println("Blackjack!!");	
		    	}
		    if(handValue<21)
		    	{
		    	Scanner userInput = new Scanner (System.in);
		    	System.out.println("Would you like to hit or stand?");
		    	String hitStay = userInput.nextLine();
		    	if (hitStay.equals("hit"))
		    		{
//		    		System.out.println("you drew a " +  get);   
		    		}
		    	else if (hitStay.equals("stand"))
		    	    {
		    	    	
		    	    }
		    	}
		    }
	}
//Not Done