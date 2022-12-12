package chapter2.Advanced;

import java.util.Scanner;

public class A04 {
/*4.Проверить, принадлежит ли число введенное с клавиатуры, интервалу (-5;3).
*/
    public static void main(String[] args) {

        System.out.println("Please enter any integer number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x>-6 && x<4){
            System.out.println("Entered number falling into a given interval");
        }else System.out.println("Entered number doesn't fall into a given interval");



    }
}
