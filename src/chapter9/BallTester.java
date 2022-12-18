package chapter9;

public class BallTester {
    public static void main(String[] args) {


        for (Ball ball: Ball.values()){
            System.out.println(ball.toString()+ "  \t" + ball.getSIZE() + "   \t" + ball.getSPORT()
                                              + "    \t" + ball.getPRICE() + "  \t"+ ball.getMATERIAL());
        }
        // не зміг відформатувати так, щоб два останні записи вписались в табличний вигляд
        // Price та Material для BALL4 і BALL5 зміщені
    }
}
