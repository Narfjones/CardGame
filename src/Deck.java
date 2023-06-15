import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    
    private List<Card> cards = new ArrayList<Card>();
    private String name;

    public Deck(){

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                    "Ten", "Jack", "Queen", "King", "Ace"};

        for(String suit : suits){

            int count = 2; // Starting card value

            for(String value : values){
                
                Card card = new Card(); // Create a card
                String str = (value + " of " + suit); // Create card name
                card.setName(str); // Set card name
                card.setValue(count); // set card value

                this.cards.add(card); // Add the card to the list

                count++; // Move to next vard value
            }
        }

    }

    public Deck(String n){

        name = n;

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                    "Ten", "Jack", "Queen", "King", "Ace"};

        for(String suit : suits){

            int count = 2; // Starting card value

            for(String value : values){
                
                Card card = new Card(); // Create a card
                String str = (value + " of " + suit); // Create card name
                card.setName(str); // Set card name
                card.setValue(count); // set card value

                this.cards.add(card); // Add the card to the list

                count++; // Move to next vard value
            }
        }

    }

    public void shuffle(){
        Collections.shuffle(cards); // shuffle cards
    }

    public Card draw(){
        return cards.remove(0); // draws the top card, removes from list, returns to method call
    }

    public int size(){
        return cards.size();
    }



}
