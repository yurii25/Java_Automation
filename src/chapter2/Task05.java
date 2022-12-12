package chapter2;

public class Task05 {
/*
5.Написать программу, которая сравнивает два числа типа int и определяет, какое из
чисел большее, а какое меньшее. Программа должна вывести что-то типа “The number
x has the greatest value”. Где “x” одно из чисел
*/
    public static void main(String[] args) {
        int A = 10;
        int B = 11;

        if (A>B){
            System.out.println("The number A has the greatest value");
        } else if (A<B) {
            System.out.println("The number B has the greatest value");
        }else System.out.println("The values of two numbers are the same");
    }
}
