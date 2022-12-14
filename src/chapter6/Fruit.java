package chapter6;

public class Fruit {
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    int calories;

    public static void makeJuice(){
        System.out.println("The juice is made!");
    }
}
