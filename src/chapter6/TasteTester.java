package chapter6;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake b = new BirthdayCake();
        b.setPrice(100);

        WeddingCake w = new WeddingCake();
        w.setPrice(150);

        System.out.println("The birthday cake was with " + b.getFlavour() + " flavour for $" + b.getPrice());

        System.out.println("And the wedding cake was with " + w.getFlavour() + " flavour for $" + w.getPrice());

    }
}
