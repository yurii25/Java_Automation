package chapter1;

public class Task5 {
//Formulas: 1m = 39.37in;   1mi = 1.609km;   1kg = 2.2046lb;   1km/hr = 0.6214mi/hr
//5.Convert miles to kilometres. And reverse
public static void main(String[] args) {
    double miles = 100;
    double km = miles * 1.609;
    System.out.println(miles + " miles equals " + km + " kilometers");

    double km1 = 50.0;
    double miles1 = km1 / 1.609;
    System.out.println(km1 + " kilometers equals " + String.format("%.3g",miles1) + " miles");
}
}
