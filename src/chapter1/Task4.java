package chapter1;

public class Task4 {
//Formulas: 1m = 39.37in;   1mi = 1.609km;   1kg = 2.2046lb;   1km/hr = 0.6214mi/hr
//4.Convert meters to inches. And reverse
public static void main(String[] args) {
    double meters = 10;
    double inches = meters * 39.37;
    System.out.println(meters + " meters equals " + inches + " inches");

    double inches1 = 50.0;
    double meters1 = inches1/39.37;
    System.out.println(inches1 + " inches equals " + String.format("%.3g",meters1) + " meters");
}

}
