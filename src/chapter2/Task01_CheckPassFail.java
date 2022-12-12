package chapter2;

public class Task01_CheckPassFail {
/*
1.Написать программу с названием “CheckPassFail”, которая выводит PASS если
переменная “mark” типа int больше или равно 50 или вывести “FAIL” в противном
случае. Программа всегда должна перед выходом печатать “DONE”
*/
    public static void main(String[] args) {
        int mark = 45;
        System.out.println("DONE");
        if (mark >= 50){
            System.out.println("PASS");

        }else System.out.println("FAIL");

    }
}
