package chapter2;

public class Task06 {
/*
6. Написать программу, которая бы решала уравнение вида a*x + b = 0 Переменные a
и b можно задать вручную. Далее нужно будет посчитать и вывести значение “х”.
Программа должна также учитывать варианты, когда или а = 0 или b = 0
*/
    public static void main(String[] args) {
        double A = 25;
        double B = 3;

        if (A == 0){
            System.out.println("You can't divide on 0");
        } else if (B == 0) {
            System.out.println("The result will be 0 regardless of the value of A");
        } else {
            double x = (0-B)/A;
            System.out.println(x);
        }




    }
}
