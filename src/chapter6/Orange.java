package chapter6;

public class Orange extends Fruit{
    public Orange() {
        setCalories(1200);
    }

    public static void wash(){
        System.out.println("The orange is washed");
    }

    public static void makeJuice(){
        System.out.println("Orange juice is made!");
    }
}

