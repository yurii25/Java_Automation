package chapter1;

public class Task1 {
//1.Convert Fahrenheit to Celsius
//Formulas: Celsius = 5/9 (F - 32) Kelvin = C + 273.16

    public static void main(String[] args) {
        double fahrenheitTemperature = 77;
        double celsiusTemperature = 5.0/9.0 * (fahrenheitTemperature-32);
        System.out.println("For fahrenheit temperature " + fahrenheitTemperature
                + " celsius temperature is: " + celsiusTemperature);
    }
}
