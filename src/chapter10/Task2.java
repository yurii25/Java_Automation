/*
2. Из коллекции компьютеров computersList() вернуть новую коллекцию из 2-х
компютеров с “SSD” жестким диском
 */
package chapter10;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<Computers> computersList = new ArrayList<>();
        computersList.add(new Computers(1, "HP", "Windows", 850, "SSD"));
        computersList.add(new Computers(2, "Lenovo", "Windows", 650, "SSD"));
        computersList.add(new Computers(3, "Dell", "Windows", 900, "HDD"));
        computersList.add(new Computers(4, "Acer", "Windows", 600, "HDD"));
        computersList.add(new Computers(5, "MacBook", "macOS", 1000, "SSD"));

        ArrayList<Computers> windowsComputersList = new ArrayList<>();

        computersList.stream().filter(c ->c.getHardDrive().equals("SSD")).forEach(x ->{

            if (windowsComputersList.size() <= 1){   // чи можна написати цю умову за допомогою limit?
                                                      // я вже по-всякому пробував - не виходить)
            windowsComputersList.add(x);
            System.out.printf("%10s%10s%5s\n", x.getBrand(), x.getOs(), x.getHardDrive());

            }
        });

    }
}
