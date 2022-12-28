/*
5. Из коллекции компьютеров computersList() вернуть Map<Integer, Computer> где
ключ будет id.
 */

package chapter10;

import java.util.*;
import java.util.stream.Collectors;


public class Task5 {
    public static void main(String[] args) {
        ArrayList<Computers> computersList1 = new ArrayList<>();
        computersList1.add(new Computers(1, "HP", "Windows", 850, "SSD"));
        computersList1.add(new Computers(2, "Lenovo", "Windows", 650, "SSD"));
        computersList1.add(new Computers(3, "Dell", "Windows", 900, "HDD"));
        computersList1.add(new Computers(4, "Acer", "Windows", 600, "HDD"));
        computersList1.add(new Computers(5, "MacBook", "macOS", 1000, "SSD"));

//        Map<Integer, Computers> comp = new HashMap<>();
//
//        computersList1.forEach(x ->{
//            comp.put(x.getId(), x);
//
//        });
//
//        comp.forEach((z, y) -> System.out.println(z + "  " + y.getBrand()));

        Map<Integer, Computers> comp = computersList1.stream()
                .collect(Collectors.toMap(p->p.getId(), t->t));

        comp.forEach((x, y) -> {
            System.out.println(x + " " + y.getBrand());
        });

    }
}
