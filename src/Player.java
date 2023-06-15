import java.util.*;

public class Player {
    
    private List<Card> hand = new ArrayList<Card>();
    private int score;
    private String name;

    Player(String n){
        score = 0;
        name = n;
    }

    public int getScore(){
        return score;
    }

    public void describe(){
        System.out.println("Player: " + name);
        for(Card card : hand){
            card.describe();
        }
    }

    public Card flip(){
        return hand.remove(0);
    }

    public void draw(Deck d){
        hand.add(d.draw());
    }

    public void incrementScore(){
        score += 1;
    }


}
