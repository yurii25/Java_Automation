/*
3. Из коллекции компьютеров computersList() вернуть коллекцию цен
 */
package chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;

public class Task3 {
    public static void main(String[] args) {
        Computers comp1 = new Computers(1, "HP", "Windows", 850, "SSD");
        Computers comp2 = new Computers(2, "Lenovo", "Windows", 650, "SSD");
        Computers comp3 = new Computers(3, "Dell", "Windows", 900, "HDD");
        Computers comp4 = new Computers(4, "Acer", "Windows", 600, "HDD");
        Computers comp5 = new Computers(5, "MacBook", "macOS", 1000, "SSD");

        ArrayList<Computers> computersList2 = new ArrayList<>();
        computersList2.add(comp1);
        computersList2.add(comp2);
        computersList2.add(comp3);
        computersList2.add(comp4);
        computersList2.add(comp5);








    }
}
