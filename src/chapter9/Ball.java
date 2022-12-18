/*
5. Написать Enum “Ball” у него будут поля
- размер (double)
- вид спорты (String)
- цена (double)
- материал (String)
добавить гетеры и конструктор
добавить 5 видов мячей
переопределить toString
в классе BallTester c помощью toString вывести в консоль инфу о мячах
 */
package chapter9;

public enum Ball {
    BALL1(30, " Football ", 50, " Leather"),
    BALL2(25, " Volleyball ", 30, " Rubber"),
    BALL3(8, " Basketball ", 35, " Leather"),
    BALL4(10, " Pool ", 70, " Plastic"),
    BALL5(5, " Golf ", 20, " Plastic");

    private double size, price;
    private String sport,material;

    private Ball( double ballSize, String typeOfSport, double ballPrice, String ballMaterial){
        size = ballSize;
        sport = typeOfSport;
        price = ballPrice;
        material = ballMaterial;

    }

    public String getProperties(Ball ball){
        return ball.size + ball.sport + ball.price + ball.material;
    }

}
