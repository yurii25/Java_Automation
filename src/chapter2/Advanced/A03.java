package chapter2.Advanced;

public class A03 {
/*3.Определить, является ли число а делителем числа b
*/
    public static void main(String[] args) {
        double a = 5;
        double b = 10;
        if (b % a == 0) {
            System.out.println("Yes");
        }else System.out.println("No");
    }
}
