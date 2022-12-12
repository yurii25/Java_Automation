package chapter2.Advanced;

public class A02 {
/*
2.Известны площади круга и квадрата. Определить: уместится ли круг в квадрате
уместится ли квадрат в круге
*/
    public static void main(String[] args) {
        double circleArea = 200;
        double squareArea = 40;

        double circleDiameter = Math.sqrt(circleArea/Math.PI);
        double squareSide = Math.sqrt(squareArea);
        double squareDiagonal = Math.sqrt(2) * Math.sqrt(squareArea);


        System.out.println("CircleDiameter:  " + circleDiameter);
        System.out.println("SquareSide:  " + squareSide);
        System.out.println("SquareDiagonal:  " + squareDiagonal);
        System.out.println("");

        if (circleDiameter < squareSide){
            System.out.println("The circle can be put into the square");
        } else if (squareDiagonal < circleDiameter) {
            System.out.println("The square can be put into the circle");
        }else System.out.println("The circle can`t be put into the square and backwards");

    }
}
