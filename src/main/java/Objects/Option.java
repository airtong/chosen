package Objects;

public class Option {
    private String description;
    private int socialRisk;
    private int environmentalRisk;
    private int militaryRisk;
    private int economicRisk;

    public Option(String description, int socialRisk,
                  int environmentalRisk, int militaryRisk, int economicRisk) {
        this.description = description;
        this.socialRisk = socialRisk;
        this.environmentalRisk = environmentalRisk;
        this.militaryRisk = militaryRisk;
        this.economicRisk = economicRisk;
    }

    public String getDescription() {
        return description;
    }

    public int getSocialRisk() {
        return socialRisk;
    }

    public int getEnvironmentalRisk() {
        return environmentalRisk;
    }

    public int getMilitaryRisk() {
        return militaryRisk;
    }

    public int getEconomicRisk() {
        return economicRisk;
    }

    public String getImpact() {
        String impact = "";
        if(environmentalRisk != 0){
            if (Math.abs(environmentalRisk) == 1)
                impact += "a ";
            else
                impact += "A ";
        }
        if(socialRisk != 0){
            if (Math.abs(socialRisk) == 1)
                impact += "s ";
            else
                impact += "S ";
        }
        if(militaryRisk != 0){
            if (Math.abs(militaryRisk) == 1)
                impact += "m ";
            else
                impact += "M ";
        }
        if(economicRisk != 0){
            if (Math.abs(economicRisk) == 1)
                impact += "e ";
            else
                impact += "E ";
        }
        return impact;
    }
}
