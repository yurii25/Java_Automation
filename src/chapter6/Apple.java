package chapter6;

public class Apple extends Fruit {

    public Apple(){
        setCalories(1000);
    }

    public static void removeSeeds(){
        System.out.println("Seeds are removed");
    }

    public static void makeJuice(){
        System.out.println("Apple juice is made!");
    }
}
