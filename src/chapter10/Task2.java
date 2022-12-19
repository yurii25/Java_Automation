/*
2. Из коллекции компьютеров computersList() вернуть новую коллекцию из 2-х
компютеров с “SSD” жестким диском
 */
package chapter10;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        Computers comp1 = new Computers(1, "HP", "Windows", 850, "SSD");
        Computers comp2 = new Computers(2, "Lenovo", "Windows", 650, "SSD");
        Computers comp3 = new Computers(3, "Dell", "Windows", 900, "HDD");
        Computers comp4 = new Computers(4, "Acer", "Windows", 600, "HDD");
        Computers comp5 = new Computers(5, "MacBook", "macOS", 1000, "SSD");

        ArrayList<Computers> computersList1 = new ArrayList<>();
        computersList1.add(comp1);
        computersList1.add(comp2);
        computersList1.add(comp3);
        computersList1.add(comp4);
        computersList1.add(comp5);

        ArrayList<Computers> windowsComputersList1 = new ArrayList<>();

        computersList1.stream().filter(c ->c.getHardDrive().equals("SSD")).forEach(x ->{

            if (windowsComputersList1.size() <= 1){   // чи можна написати цю умову за допомогою limit?
                                                      // я вже по-всякому пробував - не виходить)
            windowsComputersList1.add(x);
            System.out.printf("%10s%10s%5s\n", x.getBrand(), x.getOs(), x.getHardDrive());

            }
        });

    }
}
