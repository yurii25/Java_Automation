package chapter2;

public class Task08 {
/*
8. Написать программу, которая выведет в консоль если количество продаж больше 10
сообщение что менеджер заработал бонус, если меньше, то выполнит расчёт сколько
осталось продаж до получения бонуса
*/
    public static void main(String[] args) {
        int rate = 1000;
        int bonus = 250;
        int rateWithBonus = rate +bonus;
        int numberOfSales = 50;
        int bonusQualification = 10;
        int salesShortage = bonusQualification - numberOfSales;

        if (numberOfSales > bonusQualification){
            System.out.println("Congrats! You get a bonus of $250. Your total salary: $" + rateWithBonus);
        }else if(numberOfSales < bonusQualification) {
            System.out.println("Your total salary: $" + rate + ". You`re " + salesShortage + " sales short of a bonus");
        }else System.out.println("Your total salary: $" + rate + ". You need to make more than " + bonusQualification
        + " sales to get a bonus");
    }
}
