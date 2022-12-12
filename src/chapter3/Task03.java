package chapter3;

import java.util.Arrays;

//3. Написать программу, которая сортирует массив от минимума в максимум
public class Task03 {
    public static void main(String[] args) {
        int [] x = {25, 56, 2, 854, 3, 4, 65};

        Arrays.sort(x);

        for (int i = 0; i < x.length; i++) {

            System.out.print(x[i] + " ");
        }

    }
}
