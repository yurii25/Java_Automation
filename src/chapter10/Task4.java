/*
4. Отсортировать по цене и вернуть третий снизу по минимальной цене (используя skip и findFirst)
 */

package chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Computers> computersList = new ArrayList<>();
        computersList.add(new Computers(1, "HP", "Windows", 850, "SSD"));
        computersList.add(new Computers(2, "Lenovo", "Windows", 650, "SSD"));
        computersList.add(new Computers(3, "Dell", "Windows", 900, "HDD"));
        computersList.add(new Computers(4, "Acer", "Windows", 600, "HDD"));
        computersList.add(new Computers(5, "MacBook", "macOS", 1000, "SSD"));

        Collections.sort(computersList, Comparator.comparing(Computers::getPrice).reversed());


        computersList.stream().skip(2).forEach(x -> {

            computersList.stream().findFirst();
            System.out.println(x.getPrice());
        });








    }
}
