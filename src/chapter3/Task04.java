package chapter3;
//4. Написать программу, которая проверяет является ли строка палиндромом
//(используя массив char)
public class Task04 {
    public static void main(String[] args) {
        char [] arraysOfChars = "TENET".toCharArray();

        for (int i = 0, j = arraysOfChars.length - 1; i < j; i++, j--){
            if (arraysOfChars[i] != arraysOfChars[j]) {
                System.out.println("False");
                System. exit(0);
            }
        } System.out.println("True");
    }
}