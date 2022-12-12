package chapter1;

public class Task10 {
/*
10. Получение ипотеки
Имеем переменную - доход семьи
Написать boolean - который возвращает true, если доход меньше 50000 и больше 20000
 */
public static void main(String[] args) {
    double income = 50000;
    final int MAXRATE = 50000;
    final int MINRATE = 20000;
    boolean mortgageApproval;

    // не врахований кейс, коли дохід рівний мінімальній або максимальній сумі доходу,
    // так як в умові про це нічого не сказано

    if (income < MAXRATE && income > MINRATE){
        mortgageApproval = true;
    }else {
        mortgageApproval = false;
    }
    System.out.println("Mortgage approval: " + mortgageApproval);
}
}
