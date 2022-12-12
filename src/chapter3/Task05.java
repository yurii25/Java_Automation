package chapter3;
//5. Написать программу, которая выводит реверсивную строку
public class Task05 {
    public static void main(String[] args) {
        String a = "Qwerty";
        char[] array = a.toCharArray();
        String b = "";
        for (int i = array.length - 1; i >= 0; i--) {
            b = b + array[i];
        }
        System.out.println(b);
    }

}
