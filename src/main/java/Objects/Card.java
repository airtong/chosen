package Objects;

public class Card {
    private String name;
    private String description;
    private Character character;
    private Option firstOption;
    private Option secondOption;

    public String getName() {
        return name;
    }

    public Character getCharacter() {
        return character;
    }

    public Option getFirstOption() {
        return firstOption;
    }

    public Option getSecondOption() {
        return secondOption;
    }

    public String getDescription() {
        return description;
    }

    public void print(){
        System.out.print(character.getName() + " diz: ");
        System.out.println("\""+description+"\"");
        System.out.println("1. "+firstOption.getDescription()+" ("+firstOption.getImpact()+")");
        System.out.println("2. " + secondOption.getDescription()+" ("+secondOption.getImpact()+")");
    }

    public Card(String name, String description, Character character, Option firstOption, Option secondOption){
        this.name = name;
        this.description = description;
        this.character = character;
        this.firstOption = firstOption;
        this.secondOption = secondOption;
    }

    public Card(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void addCharacter(Character character){
        this.character = character;
    }

    public void addOptions(Option firstOption, Option secondOption){
        this.firstOption = firstOption;
        this.secondOption = secondOption;
    }
}
