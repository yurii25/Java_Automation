package chapter2;

public class Task04_PrintDayInWord {
/*
4.Написать программу с названием “PrintDayInWord”, которая печатает “Sunday”,
“Monday”, .... “Saturday”, если переменная “day” типа int будет 1, 2, 3, 4 ... 7. В
противном случае программа должна вывести “Not a valid day”. Решить задачу двумя
способами: 1) с использованием if..else if 2) с использованием switch-case
*/
    public static void main(String[] args) {
        int number = 5;
        String day = null;

        switch (number){
            case 1:day = "Sunday";
                break;
            case 2:day = "Monday";
                break;
            case 3:day = "Tuesday";
                break;
            case 4:day = "Wednesday";
                break;
            case 5:day = "Thursday";
                break;
            case 6:day = "Friday";
                break;
            case 7:day = "Saturday";
                break;

            default: day = "Not a valid day";
        }
        System.out.println(day);
    }
}
