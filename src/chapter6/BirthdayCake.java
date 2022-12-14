package chapter6;

public class BirthdayCake extends Cake {
    public BirthdayCake(){
        super("vanilla");
    }
    private int candles;

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
