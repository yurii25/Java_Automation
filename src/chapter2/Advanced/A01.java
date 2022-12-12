package chapter2.Advanced;

public class A01 {
/*
1.Сумма покупки составляет а рублей. Если а больше 1000 рублей, то предоставляется
скидка 15%. Вывести на экран сумму покупки с учетом скидки либо сообщение о том,
что скидка не предоставляется.
*/
    public static void main(String[] args) {
        int price = 1000;
        double discountRate = 0.15;
        double discount = price * discountRate;
        double purchase;

        if (price > 1000){
            purchase = price - discount;
            System.out.println("The final price to pay is: " + purchase);
        }else System.out.println("The final price to pay is: " + price);

    }
}
