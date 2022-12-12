package chapter2;

public class Task07 {
/*
7. Написать программу, для расчёта зарплаты менеджера по продажам. Если
менеджер совершил более 10 продаж он получает бонус 250$. Базовая ставка 1000$.
*/
    public static void main(String[] args) {
        int rate = 1000;
        int bonus = 250;
        int rateWithBonus = rate +bonus;
        int bonusQualification = 10;
        int numberOfSales = 8;

        if (numberOfSales > bonusQualification){
            System.out.println("Congrats! You get a bonus of $250. Your total salary: $" + rateWithBonus);
        }else System.out.println("Your total salary: $" + rate);

    }
}
