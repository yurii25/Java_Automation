package chapter1;

public class Task11 {
/*
11. Закупка
Имеем 2 переменные - первая - наличие в магазине яблок сорта 1 вторая - наличие в
магазине яблок сорта 2
Написать boolean - который возвращает true, если есть в наличии хотя бы один сорт
*/
public static void main(String[] args) {
    boolean appleOne = false;
    boolean appleTwo = true;
    boolean stock;

    stock = appleOne || appleTwo;

    System.out.println("Stock: " + stock);
}
}
