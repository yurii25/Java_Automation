package chapter6;

public class Cake {
    private String flavour;
    private int price;

    public Cake(String flavour){
        setFlavour(flavour);
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
