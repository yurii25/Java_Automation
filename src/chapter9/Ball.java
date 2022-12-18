package chapter9;

public enum Ball {
    BALL1(30, "Football", 50, "Leather"),
    BALL2(25, "Volleyball", 30, "Rubber"),
    BALL3(8, "Basketball", 35, "Leather"),
    BALL4(10, "Pool", 70, "Plastic"),
    BALL5(5, "Golf", 20, "Plastic");


    private final double SIZE;
    private final String SPORT;
    private final double PRICE;
    private final String MATERIAL;

    Ball( double ballSize, String typeOfSport, double ballPrice, String ballMaterial){
        SIZE = ballSize;
        SPORT = typeOfSport;
        PRICE = ballPrice;
        MATERIAL = ballMaterial;

    }
    public double getSIZE() {
        return SIZE;
    }

    public String getSPORT() {
        return SPORT;
    }

    public double getPRICE() {
        return PRICE;
    }

    public String getMATERIAL() {
        return MATERIAL;
    }

}
