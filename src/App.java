public class App {
    public static void main(String[] args){
        
        Deck deck = new Deck("Frank");
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        deck.shuffle();

        int handSize = deck.size()/2;

        for(int i = 0; i < handSize; i++){
            player1.draw(deck);
            player2.draw(deck);
        } 

        for(int i = 0; i < 26; i++){

            int p1Score = player1.flip().getValue();
            int p2Score = player2.flip().getValue();

            if(p1Score > p2Score){
                player1.incrementScore();
            } else if (p2Score == p1Score){
                continue;
            } else{
                player2.incrementScore();
            }

        }

        System.out.println(player1.getScore());
        System.out.println(player2.getScore());
    }
}
