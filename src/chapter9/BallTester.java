package chapter9;

public class BallTester {
    public static void main(String[] args) {

        // FIRST PRINT SOLUTION

        System.out.println("NAME    SIZE    SPORT           PRICE   MATERIAL");

        for (Ball ball: Ball.values()){
            System.out.printf("%s%s%n", ball, ball.getProperties(ball));
        }
        System.out.println(" ");
        System.out.println("OR: \n");

        // SECOND PRINT SOLUTION


        System.out.println("NAME    SIZE    SPORT           PRICE   MATERIAL");
        System.out.println(Ball.BALL1 + ":" + Ball.BALL1.getProperties(Ball.BALL1));
        System.out.println(Ball.BALL2 + ":" + Ball.BALL2.getProperties(Ball.BALL2));
        System.out.println(Ball.BALL3 + ":" + Ball.BALL3.getProperties(Ball.BALL3));
        System.out.println(Ball.BALL4 + ":" + Ball.BALL4.getProperties(Ball.BALL4));
        System.out.println(Ball.BALL5 + ":" + Ball.BALL5.getProperties(Ball.BALL5));

        // не зміг відформатувати так, щоб два останні записи вписались в табличний вигляд
        // Price та Material для BALL4 і BALL5 зміщені

        // Також, я не створював геттерів - не впевнений чи вони тут взагалі потрібні,
        // так як конструктор не може бути public
    }
}
