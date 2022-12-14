package chapter6;

public class WeddingCake extends Cake{
    public WeddingCake(){
        super("chocolate");
    }
    private int tiers;

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
