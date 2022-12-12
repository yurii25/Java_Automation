/*
A - Написать метод (void) который переворачивает массив.
В main должен быть вызван метод который переворачивает массив, потом
вывести с помощью sout. Важно - не вывести в консоль с последнего элемента, а
проапдейтить существующий массив с помощью void
 */
package chapter4;

import java.util.Arrays;

public class TaskA {
    public static void main(String[] args) {
        ArrayBackwards();
    }
    public static void ArrayBackwards(){
        int[] a = {12, 11, 258, 2, 569, 4};
        for (int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = tmp;
        }
        System.out.print(Arrays.toString(a) + " ");
    }
}
