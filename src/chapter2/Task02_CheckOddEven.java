package chapter2;

public class Task02_CheckOddEven {
/*
2.Написать программу с названием “CheckOddEven”, которая печатает “Odd Number”
если переменная “number” типа int нечетная. Или “Even Number” если переменная
четная. Программа всегда должна перед выходом печатать “BYE”
*/
public static void main(String[] args) {
    int number = 12;
    System.out.println("BYE");
    if (number % 2 == 0){
        System.out.println("Even Number");

    }else System.out.println("Odd Number");

}
}
