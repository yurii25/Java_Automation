package chapter2;

public class Task09 {
/*
9. Получение ипотеки
Имеем 2 переменные - возраст мужа и жены
Написать программу, которая выводит в консоль результат.
Задачу решить используя вложенный if (сначала проверить возраст жены, потом мужа)
*/
    public static void main(String[] args) {
        int husbandAge = 36;
        int wifeAge = 25;

        int mortgageQualifier = 35;

        if (husbandAge <= mortgageQualifier){
            if(wifeAge <= mortgageQualifier){
                System.out.println("Congrats! You`re qualified for a loan");
            }
            else System.out.println("Sorry, both partners must be under 36 years old");
        }
        else System.out.println("Sorry, you need to be under 36 years old");



    }
}
