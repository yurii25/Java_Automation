package chapter3;

import java.util.Arrays;

//7. Написать программу, который переворачивает массив
public class Task07 {
    public static void main(String[] args) {
        int[] a = {12, 11, 258, 2, 569, 4};

        for (int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = tmp;
        }

            System.out.print(Arrays.toString(a) + " ");


    }
}
