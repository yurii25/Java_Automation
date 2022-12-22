/*
7. Написать boolean - который проверяет что в коллекции есть компьютер с ОС
“MacOS” (anyMatch)
 */

package chapter10;

import java.util.ArrayList;

public class Task7 {
    private static boolean macOS = false;

    public static void main(String[] args) {



        ArrayList<Computers> computersList3 = new ArrayList<>();
        computersList3.add(new Computers(1, "HP", "DOS", 850, "SSD"));
        computersList3.add(new Computers(2, "Lenovo", "Windows", 650, "SSD"));
        computersList3.add(new Computers(3, "Dell", "Windows", 900, "HDD"));
        computersList3.add(new Computers(4, "Acer", "Windows", 600, "HDD"));
        computersList3.add(new Computers(5, "MacBook", "MacOS", 1000, "SSD"));



        computersList3.forEach(x -> {

            if(x.getOs().equals("MacOS")){
                macOS = true;
            }

        });

        System.out.println(macOS);
        System.out.println(" workspace test8 ");

    }
}
