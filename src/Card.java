public class Card {
    
    private int value; // contains numbers between 2-14 to represent card value
    private String name; // contain card name. e.g. Ace of Diamonds etc...

    public int getValue(){ // returns numerical value of card
        return value;
    }

    public String getName(){ // returns value of card name
        return name;
    }

    public void setValue(int v){ // sets numerical value
        value = v;
    }

    public void setName(String s){ // names the card
        name = s;
    }

    public void describe(){

        String str1 = String.format("Your card is: %s", name);
        String str2 = String.format("Your cards value is: %d", value);

        System.out.println(str1);
        System.out.println(str2);
    }

}
