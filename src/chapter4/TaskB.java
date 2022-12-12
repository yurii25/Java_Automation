/*
B - Расчёт зарплаты агента по продажам
Расчёт зарплаты нужно разбить на несколько методов
1. Первый метод получает количество отработанных часов и базовую
ставку. если количество отработанных часов больше 160 то каждый
последующий час по коэф 1,5 (параметры у метода - входящие часы int, и double
rate) , возвращаемое значение - зарплата. Это должна быть сумма базовой
зарплаты (до 160 часов) + бонус за переработку свыше 160 часов (если
переработка была) (double)
2. Второй метод - получает коэффициент на базовые часы (которые до 160) в
зависимости от стажа работы (параметры у метода - стаж работы int, возвращаемое
значение double коэффициент) до 2 лет 1 от 2 до 4 - 1.2 от 4 до 6 - 1.3 от 6 лет - 1.4
3. В зависимости от количества продаж - больше 20 - бонус 250, меньше 10
штраф 150 (параметры у метода - количество продаж int, возвращаемое значение
double бонус за количество продаж)
4. четвертый в зависимости от суммы продаж больше 15000 $ - тоже
добавляется бонус (параметры у метода - сумма продаж double, возвращаемое
значение double бонус за сумму продаж)
В методе main проинициализировать все нужные переменные, вызвать методы
и сделать расчет. Результат вывести в консоль
 */
package chapter4;

public class TaskB {
    public static void main(String[] args) {
        double x = salaryCalculation(120, 10000);
        System.out.println("Your salary depending on the ratio: " + x);

        double y = experienceRatioCalculation(5);
        System.out.println("The ratio of salary is: " + y);

        double z = bonusOrFineCalculation(12);
        System.out.println("Additional bonus/fine: " + z);

        double v = bonusCalculation(16000);
        System.out.println("Bonus: " + v);

        double salary = y * (x + z + v);
        System.out.println("Your salary: " + salary);



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
        double bonus = 0;
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
