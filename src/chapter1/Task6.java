package chapter1;

public class Task6 {
//Formulas: 1m = 39.37in;   1mi = 1.609km;   1kg = 2.2046lb;   1km/hr = 0.6214mi/hr
//6.Convert kilograms to pounds. And reverse
public static void main(String[] args) {
    double kg = 100;
    double pounds = kg * 2.2046;
    System.out.println(kg + " kilograms equals " + pounds + " pounds");

    double pounds1 = 50.0;
    double kg1 = pounds1 / 2.2046;
    System.out.println(pounds1 + " pounds equals " + String.format("%.3g",kg1) + " kilograms");
}
}
