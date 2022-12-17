/*
 1 - Расчёт зарплаты агента по продажам
Расчёт зарплаты нужно разбить на несколько методов:
1. Первый метод получает количество отработанных часов и базовую ставку.
если количество отработанных часов больше 160 то каждый
последующий час по коэф 1,5 (параметры у метода - входящие часы
int, и double rate) , возвращаемое значение - зарплата. Это должна
быть сумма базовой зарплаты (до 160 часов) + бонус за переработку
свыше 160 часов (если переработка была) (double)

2. Второй метод - получает коэффициент на базовые часы (которые до 160) в
зависимости от стажа работы (параметры у метода - стаж работы int,
возвращаемое значение double коэффициент)
до 2 лет 1
от 2 до 4 - 1.2
от 4 до 6 - 1.3
от 6 лет - 1.4
3. В зависимости от количества продаж - больше 20 - бонус 250, меньше 10
штраф 150 (параметры у метода - количество продаж int, возвращаемое
значение double бонус за количество продаж)
4. четвертый в зависимости от суммы продаж больше 15000 $ - тоже добавляется
бонус (параметры у метода - сумма продаж double, возвращаемое значение
double бонус за сумму продаж)
Пункты 2, 3 и 4 появляются только при прохождении испытательного срока
Создать класс SalesAgentSalary - у него будет 2 параметризированных конструктора -
первый принимает в себя параметры - входящие часы int, double - рейт в час;
второй принимает в себя параметры - входящие часы int, double - рейт в час, int - стаж
работы, int - количество продаж, double - Сумма продаж
Все методы расчета (можно взять с прошлого урока)
Метод getSalary - который будет возвращать double
В конструкторах вызывать метод setSalary - который будет сэтить сэлэри в
зависимости от конструктора (и от того прошел ли испытательный срок
соответственно)
Понимание прошел ли сотрудник испытательный срок реализовать с помощью
конструктора (если 2 параметра, то еще на ИС, если 5 параметров, то уже прошел)
Создать класс SalaryCalculation.
В нем создать метод main, в методе main 2 ссылки на объект SalesAgentSalary c
разными конструкторами вывести в консоль результат
 */
package chapter5;

public class SalaryCalculation {
    public static void main(String[] args) {
        boolean probation = false;

        if (probation) {
            SalesAgentSalary s1 = new SalesAgentSalary(160, 1000);

            s1.setSalary(salaryCalculation(s1.getHours(), s1.getRate()));

            System.out.println("Your salary on probation: " + s1.getSalary());

        }else {
            SalesAgentSalary s2 = new SalesAgentSalary(170, 4000, 4, 25, 10000);
            s2.setSalary(salaryCalculation(s2.getHours(), s2.getRate()));

            System.out.println("Your salary depending on the ratio: " + s2.getSalary());

            double x = experienceRatioCalculation(s2.getExperience());
            System.out.println("The ratio of salary is: " + x);

            double y = bonusOrFineCalculation(s2.getSalesQuantity());

            double z = bonusCalculation(s2.getSalesRevenue());
            System.out.println("Bonus: " + z);

            double salary = x * (s2.getSalary() + y + z);
            System.out.println("Your salary: " + salary);

        }

    }
    public static double salaryCalculation (int hours, double rate){
        double ratio = 1.5;
        double workShift = 160;

        if (hours > workShift){
            double salary = rate + (hours - workShift) * ratio;
            return salary;
        }else return rate;

    }
    public static double experienceRatioCalculation(int experience) {
        double experienceRatio = 0;
        if (experience <= 2) {
            return experienceRatio = 1;
        } else if (2 < experience && experience <= 4) {
            return experienceRatio = 1.2;
        } else if (4 < experience && experience <= 6) {
            return experienceRatio = 1.3;
        } else if (experience > 6) {
            return experienceRatio = 1.4;
        }
        return experienceRatio;
    }
    public static double bonusOrFineCalculation (int sales){
        double bonus;
        if (sales > 20){
            bonus = 250;
        }else if (sales < 10){
            bonus = -150;
        }else bonus = 0;

        return bonus;
    }
    public static double bonusCalculation (double salesValue){
        double bonus = 0;
        if(salesValue > 15000){
            bonus = 250;
        }
        return bonus;
    }

}
