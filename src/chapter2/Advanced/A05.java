package chapter2.Advanced;

public class A05 {
/*5.Даны три различных числа. Определить, какое из них (первое, второе или третье) -
самое большое - самое маленькое - является средним
*/
    public static void main(String[] args) {
        int x = 12;
        int y = 210;
        int z = 8;

        if(x>y && x>z){
            System.out.println(x + " is the largest number");
        } else if (y>x && y>z) {
            System.out.println(y + " is the largest number");
        }else if (z>x && z>y) {
            System.out.println(z + " is the largest number");
        }

        if (x<y && x<z){
            System.out.println(x + " is the smallest number");
        }else if (y<x && y<z){
            System.out.println(y + " is the smallest number");
        }else if (z<y && z<x){
            System.out.println(z + " is the smallest number");
        }

        if (x>y && x<z) {
            System.out.println(x + " is the middle number");
        }else if (x>z && x<y){
            System.out.println(x + " is the middle number");
        }else if (y>x && y<z){
            System.out.println(y + " is the middle number");
        }else if(y<x && y>z){
                System.out.println(y + " is the middle number");
        }else if (z>y && z<x){
            System.out.println(z + " is the middle number");
        }else if (z<y && z>x){
            System.out.println(z + " is the middle number");
        }

    }
}
