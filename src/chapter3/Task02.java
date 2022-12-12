package chapter3;
//2. Написать программу, которая печатает значения sin(x), где x это каждые 10 градусов
//от 0 до 360.
public class Task02 {
    public static void main(String[] args) {
        int sinusStep = 10;
        int angleStep = -10;

        for(int i = 0; i <= 360; i=i+sinusStep){
            double x = Math.sin(i);
            angleStep = angleStep + 10;
            System.out.println("The value of the " + angleStep + " angle is: "  + x);
        }
    }
}
