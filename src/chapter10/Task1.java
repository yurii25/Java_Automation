/*
1. Из коллекции компьютеров computersList() создать новую коллекцию с только “Windows”
 */
package chapter10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<Computers> computersList = new ArrayList<>();
        computersList.add(new Computers(1, "HP", "Windows", 850, "SSD"));
        computersList.add(new Computers(2, "Lenovo", "Windows", 650, "SSD"));
        computersList.add(new Computers(3, "Dell", "Windows", 900, "HDD"));
        computersList.add(new Computers(4, "Acer", "Windows", 600, "HDD"));
        computersList.add(new Computers(5, "MacBook", "macOS", 1000, "SSD"));


//        ArrayList<Computers> windowsComputersList = new ArrayList<>();
//
//        computersList.forEach(x -> {
//            if (x.getOs().equals("Windows")) {
//                windowsComputersList.add(x);
//                System.out.printf("%10s%10s\n", x.getBrand(), x.getOs());
//            }
//
//        });

        List<Computers> onlyWindowsComputers = computersList.stream()
                .filter(s->s.getOs().equals("Windows"))
                .collect(Collectors.toList());

        for(Computers s : onlyWindowsComputers){
            System.out.printf("%10s%10s\n", s.getBrand(), s.getOs());
        }
    }
}


