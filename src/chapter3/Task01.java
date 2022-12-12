package chapter3;

//1. Написать программу, которая находит минимальное значение в массиве
public class Task01 {
    public static void main(String[] args) {
        int [] a = {65, 8, 3, 4, 8, 25};
        int minimal = a[0];

        for (int i = 0; i < a.length; i++) {

            if(a[i] < minimal) {
                minimal = a[i];
            }
        }
        System.out.println("Minimal value is: " + minimal);

    }
}
