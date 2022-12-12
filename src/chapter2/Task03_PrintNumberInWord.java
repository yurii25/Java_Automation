package chapter2;

public class Task03_PrintNumberInWord {
/*
3.Написать программу с названием “PrintNumberInWord”, которая напечатает “ONE”,
“TWO”, ..., “NINE”, “OTHER” если переменная “number” типа int будет 1, 2, 3, 4, ... 9, или
любой другой
. Решить задачу двумя способами: 1) с использованием if..else if 2) с использованием
switch-case
*/
    public static void main(String[] args) {
        int number = 5;
        String num = null; // Чому не можу записати: "String num;" ?  справа у версії джави? в мене Java 11

        switch (number){
            case 1:num = "ONE";
                break;
            case 2:num = "TWO";
                break;
            case 3:num = "THREE";
                break;
            case 4:num = "FOUR";
                break;
            case 5:num = "FIVE";
                break;
            case 6:num = "SIX";
                break;
            case 7:num = "SEVEN";
                break;
            case 8:num = "EIGHT";
                break;
            case 9:num = "NINE";
                break;
        }
        System.out.println(num);

    }
}
