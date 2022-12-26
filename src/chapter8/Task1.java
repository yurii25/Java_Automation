package chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Please, enter the number: ");
            double a = scanner.nextDouble();
                sum = sum + a;
            System.out.println("The sum is: " + sum);

            boolean InputMismatchException = false;

            if(InputMismatchException){
                throw new InputMismatchException();
            }
        }
        System.out.println("The sum is: " + sum);
    }

}


