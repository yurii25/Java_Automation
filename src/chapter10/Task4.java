/*
4. Отсортировать по цене и вернуть третий снизу по минимальной цене (используя skip и findFirst)
 */

package chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Computers> computersList = new ArrayList<>();
        computersList.add(new Computers(1, "HP", "Windows", 850, "SSD"));
        computersList.add(new Computers(2, "Lenovo", "Windows", 650, "SSD"));
        computersList.add(new Computers(3, "Dell", "Windows", 900, "HDD"));
        computersList.add(new Computers(4, "Acer", "Windows", 600, "HDD"));
        computersList.add(new Computers(5, "MacBook", "macOS", 1000, "SSD"));

//        Collections.sort(computersList, Comparator.comparing(Computers::getPrice).reversed());
//
//        System.out.println("Sorted descending: ");
//
//        computersList.forEach(x -> {
//            System.out.println(x.getPrice());
//        });
//
//        System.out.println("");
//
//        System.out.println("Result: ");
//
//        Computers a = computersList.stream().skip(2).findFirst().get();
//
//        System.out.println(a.getPrice());


        List<Computers> thirdOne = computersList.stream()
                .sorted(Comparator.comparingDouble(Computers::getPrice).reversed())
                .skip(2).findFirst()
                .stream()
                .collect(Collectors.toList());

        for(Computers s : thirdOne){
            System.out.println(s.getPrice());
        }



    }
}
