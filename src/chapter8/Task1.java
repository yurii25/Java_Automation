package chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        xxx();

    }

    public static void xxx() {

        double sum = 0;
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Please, enter the number: ");
                Scanner scanner = new Scanner(System.in);
                double a = scanner.nextDouble();
                sum = sum + a;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input type");
                i = i -1;

            }

        }
        System.out.println("The sum is: " + sum);
    }
}


