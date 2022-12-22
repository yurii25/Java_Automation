package chapter9;

public class BallTester {
    public static void main(String[] args) {


        for (Ball ball: Ball.values()){
            System.out.println(ball); // тут додаючи до Ball toString(), чи ні - результат той самий
                                      // в завданні вказано: "в классе BallTester c помощью
                                      // ... toString вывести в консоль инфу о мячах"
        }
        // не зміг відформатувати так, щоб два останні записи вписались в табличний вигляд
        // Price та Material для BALL4 і BALL5 зміщені
    }
}
