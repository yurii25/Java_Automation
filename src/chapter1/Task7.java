package chapter1;

public class Task7 {
//Formulas: 1m = 39.37in;   1mi = 1.609km;   1kg = 2.2046lb;   1km/hr = 0.6214mi/hr
//7. Convert speed km/hr to mi/hr. And reverse
public static void main(String[] args) {
    double kmPerHr = 100;
    double miPerHr = kmPerHr * 0.6214;
    System.out.println(kmPerHr + " km/hr equals " + String.format("%.4g",miPerHr) + " mi/hr");

    double miPerHr1 = 50.0;
    double kmPerHr1 = miPerHr1 / 0.6214;
    System.out.println(miPerHr1 + " mi/hr " + String.format("%.4g",kmPerHr1) + " km/hr");
}
}
