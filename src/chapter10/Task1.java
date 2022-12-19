/*
1. Из коллекции компьютеров computersList() создать новую коллекцию с только “Windows”
 */
package chapter10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Computers comp1 = new Computers(1, "HP", "Windows", 850, "SSD");
        Computers comp2 = new Computers(2, "Lenovo", "Windows", 650, "SSD");
        Computers comp3 = new Computers(3, "Dell", "Windows", 900, "HDD");
        Computers comp4 = new Computers(4, "Acer", "Windows", 600, "HDD");
        Computers comp5 = new Computers(5, "MacBook", "macOS", 1000, "SSD");


        ArrayList<Computers> computersList = new ArrayList<>();
        computersList.add(comp1);
        computersList.add(comp2);
        computersList.add(comp3);
        computersList.add(comp4);
        computersList.add(comp5);


        ArrayList<Computers> windowsComputersList = new ArrayList<>();

        computersList.forEach(x -> {
            if (x.getOs().equals("Windows")) {
                windowsComputersList.add(x);
                System.out.printf("%10s%10s\n", x.getBrand(), x.getOs());
            }

        });


    }

}


