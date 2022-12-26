/*
3. Из коллекции компьютеров computersList() вернуть коллекцию цен
 */
package chapter10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<Computers> computersList = new ArrayList<>();
        computersList.add(new Computers(1, "HP", "Windows", 850, "SSD"));
        computersList.add(new Computers(2, "Lenovo", "Windows", 650, "SSD"));
        computersList.add(new Computers(3, "Dell", "Windows", 900, "HDD"));
        computersList.add(new Computers(4, "Acer", "Windows", 600, "HDD"));
        computersList.add(new Computers(5, "MacBook", "macOS", 1000, "SSD"));


//        ArrayList<Double> pricesList = new ArrayList<>();
//
//        computersList.forEach(x ->{
//            pricesList.add(0, x.getPrice());
//
//        });
//        System.out.println("Price: ");
//
//        pricesList.forEach(y ->{
//            System.out.println(y);
//        });
        // чому ціни додаються в новий ArrayList і виводяться в зворотньому порядку?
        // як зберегти оригінальний порядок?

        List<Double> onlyPricesComputersList = computersList.stream()
                .map(Computers::getPrice)
                .collect(Collectors.toList());

        for(Double s : onlyPricesComputersList){
            System.out.println(s);
        }
    }
}
