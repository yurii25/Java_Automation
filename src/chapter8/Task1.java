package chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


//        double sum = 0;
//
//        try {
//            for (int i = 0; i < 5; i++) {
//                System.out.println("Please, enter the number: ");
//                double a = scanner.nextDouble();
//                sum = sum + a;
//            }
//        }catch (InputMismatchException e){
//            System.out.println("Invalid input type");
//        }
//
//        System.out.println("The sum is: " + sum);

            System.out.println("The sum is: " + xxx());

    }

    public static double xxx(){
        double sum = 0;

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Please, enter the number: ");
                double a = scanner.nextDouble();
                sum = sum + a;
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid input type");
        }
        return sum;


    }
}


