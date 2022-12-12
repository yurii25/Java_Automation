/*
2 Счет за телефон
Рассчитать стоимость пакета в месяц. Инициализацию getPhoneBill сделать с
помощью конструтора из другого класса
1. Стоимость интернета до 8гб включена в пакет, после 50 грн / 500 мб (вход
параметр кол-во потраченных гб)
2. Звонки по Украине до 500 минут 0,5 грн / мин после 0,75
3. Смс до 50 шт 1 грн после 1,50
4. Звонки за рубеж зона 1 1.5 грн/мин
5. Звонки за рубеж зона 2 2 грн/мин
После подсчёта суммы добавляется налог 7 %
 */
package chapter5;

public class PhoneBill {
    public static void main(String[] args) {
        getPhoneBill bill = new getPhoneBill(9000, 400, 20,
                                             1, 50);
        double adMb = additionalMbCalculation(bill.getAdditionalMb());
        double insideCalls = ukraineCallsCalculation(bill.getMinutesInsideRoaming());
        double sms = smsCalculation(bill.getSmsQuantity());
        double outsideCals = foreignCallsCalculation(bill.getZone(), bill.getMinutesOutsideRoaming());

        System.out.println("Additional mb`s cost: " + adMb);
        System.out.println("Inside calls cost: " + insideCalls);
        System.out.println("SMS cost: " + sms);
        System.out.println("Roaming calls cost: " + outsideCals);
        double taxRate = 0.07;
        double tax = taxRate * (adMb + insideCalls + sms + outsideCals);

        System.out.printf("Tax: %.2f", tax);
        System.out.println(" ");

        double phoneBill = tax + adMb + insideCalls + sms + outsideCals;
        System.out.printf("Total: %.2f", phoneBill);


    }
    public static double additionalMbCalculation (double additionalMb){
        double a = 0;
        if(additionalMb > 8000) {
            for (double i = 8000; i < additionalMb; i = i + 500) {
                a = a + 50;
            }
        }return a;
    }
    public static double ukraineCallsCalculation (double minutes){
        double ukraineCallRatio = 0.75;
        double ukraineCallsCost;
        if(minutes <= 500){
            ukraineCallRatio = 0.5;
            ukraineCallsCost = minutes * ukraineCallRatio;
            return ukraineCallsCost;
        }else ukraineCallsCost = ukraineCallRatio * minutes;
        return ukraineCallsCost;
    }
    public static double smsCalculation (double smsQuantity){
        double smsPrice = 1.5;
        double smsCost;
        if(smsQuantity <= 50){
            smsPrice = 1;
            smsCost = smsPrice * smsQuantity;
            return smsCost;
        }else smsCost = smsPrice * smsQuantity;
        return smsCost;
    }
    public static double foreignCallsCalculation (int zone, double minutes){
        double zoneRatio;
        double callsCost = 0;
        if(zone == 1){
            zoneRatio = 1.5;
            callsCost = minutes * zoneRatio;
            return callsCost;
        }else if (zone == 2){
            zoneRatio = 1.5;
            callsCost = minutes * zoneRatio;
            return callsCost;
        }else return callsCost;
    }

}
