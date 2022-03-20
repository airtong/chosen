package Objects;

import java.util.ArrayList;

public class Event {
    private String name;
    private int probabilidade;
    private ArrayList<Card> cards = new ArrayList<Card>();

    public String getName() {
        return name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void aumentarProbabilidade(){
        this.probabilidade++;
    }

    public Event(String name){
        this.name = name;
        this.probabilidade = 1;
    }
}
