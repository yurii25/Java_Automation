package chapter3;
//6. Написать программу, которая подсчитывает количество элементов массива int*ов,
//которые делятся на 2, но не делятся на 3 и выводит в консоль
public class Task06 {
    public static void main(String[] args) {

        int[] a = {25, 12, 40, 2, 3, 77, 11, 15};
        int numberOfEven = 0;
        int numberOfOdd = 0;

        for (int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                numberOfEven = numberOfEven + 1;
            }else numberOfOdd = numberOfOdd + 1;
        }
        System.out.println("Number of even: " + numberOfEven + "   парні");
        System.out.println("Number of odd: " + numberOfOdd + "    не парні");
    }
}
