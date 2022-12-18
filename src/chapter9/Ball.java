package chapter9;

import java.util.Formatter;

public enum Ball {
    BALL1(30, "Football", 50, "Leather"),
    BALL2(25, "Volleyball", 30, "Rubber"),
    BALL3(8, "Basketball", 35, "Leather"),
    BALL4(10, "Pool", 70, "Plastic"),
    BALL5(5, "Golf", 20, "Plastic");



    private double size;
    private String sport;
    private double price;
    private String material;



    private Ball( double ballSize, String typeOfSport, double ballPrice, String ballMaterial){
        size = ballSize;
        sport = typeOfSport;
        price = ballPrice;
        material = ballMaterial;

    }

    public String getProperties(Ball ball){

        return "\t" + ball.size + " \t" + ball.sport + "    \t" + ball.price + "\t" + ball.material;
   }

}
