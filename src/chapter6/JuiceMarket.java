package chapter6;

public class JuiceMarket {
    public static void main(String[] args) {
        Apple.makeJuice();
        Banana.makeJuice();

        Fruit a = new Orange();
        a.setCalories(2000);
        System.out.println("This fruit contains " + a.getCalories());

        Lemon.slice();

        a = new Banana();
        System.out.println(a.calories);
    }
}
