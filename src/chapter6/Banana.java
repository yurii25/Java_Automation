package chapter6;

public class Banana extends Fruit{
    public Banana(){
        setCalories(1100);
    }

    public static void peel(){
        System.out.println("The banana is peeled");
    }

    public static void makeJuice(){
        System.out.println("Banana juice is made!");
    }
}
