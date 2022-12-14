package chapter6;

public class Lemon extends Fruit{
    public Lemon(){
        setCalories(1300);
    }

    public static void slice(){
        System.out.println("The lemon is sliced");
    }

    public static void makeJuice(){
        System.out.println("Lemon juice is made!");
    }
}
