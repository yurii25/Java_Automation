package chapter2;

public class Task10 {
/*
10. Написать метод, используя switch, который принимает в себя номер пальца -
переменную типа int и в зависимости от номер выводит название пальца (1-”большой”
и т д)
*/
    public static void main(String[] args) {

        int numberOfaFinger = 3;
        String name = null;

        switch (numberOfaFinger){
            case 1:name = "Великий";
                break;
            case 2:name = "Вказівний";
                break;
            case 3:name = "Середній";
                break;
            case 4:name = "Підмізинний";
                break;
            case 5:name = "Мізинець";
                break;

            default: name = "Not valid finger";
        }
        System.out.println(name);

    }
}
