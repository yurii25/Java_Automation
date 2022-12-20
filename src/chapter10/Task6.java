/*
6. Написать boolean - который проверяет что в коллекции нет компьютера с ОС
“DOS” (noneMatch)
 */

package chapter10;

import java.util.ArrayList;

public class Task6 {
    private static boolean DOS = false;

    public static void main(String[] args) {
        ArrayList<Computers> computersList2 = new ArrayList<>();
        computersList2.add(new Computers(1, "HP", "DOS", 850, "SSD"));
        computersList2.add(new Computers(2, "Lenovo", "Windows", 650, "SSD"));
        computersList2.add(new Computers(3, "Dell", "Windows", 900, "HDD"));
        computersList2.add(new Computers(4, "Acer", "Windows", 600, "HDD"));
        computersList2.add(new Computers(5, "MacBook", "macOS", 1000, "SSD"));

        computersList2.forEach(x -> {

            if(x.getOs().equals("DOS")){
                 DOS = true;
            }

        });

        System.out.println(DOS);



    }
}
