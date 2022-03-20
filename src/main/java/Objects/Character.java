package Objects;

public class Character {
    private String name;
    private String category;

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Character(String name, String category){
        this.name = name;
        this.category = category;
    }
}
