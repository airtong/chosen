package Objects;

public class Match {
    private String gamer;
    private int social;
    private int environmental;
    private int military;
    private int economic;
    private int score;

    public String getGamer() {
        return gamer;
    }

    public void setGamer(String gamer) {
        this.gamer = gamer;
    }

    public int getSocial() {
        return social;
    }

    public void setSocial(int social) {
        this.social = social;
    }

    public int getEnvironmental() {
        return environmental;
    }

    public void setEnvironmental(int environmental) {
        this.environmental = environmental;
    }

    public int getMilitary() {
        return military;
    }

    public void setMilitary(int military) {
        this.military = military;
    }

    public int getEconomic() {
        return economic;
    }

    public void setEconomic(int economic) {
        this.economic = economic;
    }

    public void increaseEnvironmental(int i){
        this.environmental += i;
    }

    public void increaseSocial(int i){
        this.social += i;
    }

    public void increaseMilitary(int i){
        this.military += i;
    }

    public void increaseEconomic(int i){
        this.economic += i;
    }

    public void alterStats(Option option){
        this.environmental += (option.getEnvironmentalRisk()*5);
        this.economic += (option.getEconomicRisk()*5);
        this.military += (option.getMilitaryRisk()*5);
        this.social += (option.getSocialRisk()*5);
    }

    public void printStats(){
        System.out.println("---------------------------");
        System.out.println("A:["+ this.environmental+"]" +
                            " S:["+ this.social+"]" +
                            " M:["+ this.military+"]" +
                            " E:["+ this.economic +"]");
        System.out.println("---------------------------");
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Match(String gamer){
        this.economic = 50;
        this.environmental = 50;
        this.military = 50;
        this.social = 50;
    }
}
