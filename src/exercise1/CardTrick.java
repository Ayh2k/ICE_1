package exercise1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
        hand[i] = new Card();
        hand[i].setValue((int) (1 + Math.random() * 13));
        Random rand = new Random();
        int randomSuitIndex = rand.nextInt(4);
        hand[i].setSuit(Card.SUITS[randomSuitIndex]);
    }

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the value of the card (1-13): ");
    int value = scanner.nextInt();
    System.out.print("Enter the suit of the card (1-4): ");
    int suitIndex = scanner.nextInt() - 1;
    String suit = Card.SUITS[suitIndex];

    for (Card card : hand) {
        if (card.getValue() == value && card.getSuit().equals(suit)) {
            printInfo(); // invoke the printInfo() method
            break;
        }
    }
    
}
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        }
            // 
        }
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, print System.out.println("Congratulations, you guessed right!");.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    
    //I'm done!
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Ayhan Ahsan");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- to be a software developer");
        System.out.println("-- Or a network specialist");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- video games");
        System.out.println("-- watching movies");
        System.out.println("-- reading");
        System.out.println("-- learning new things");

        System.out.println();
        
    
    }

}
