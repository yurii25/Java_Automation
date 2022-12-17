/*
2. Для входящей строки вернуть версию без первого и последнего символов
строки. Строка может быть любой длины, включая 0.

public String withoutFirstAndLastChar(String inputString) {}

"Hello" → "ell"
"abc" → "b"
 */

package chapter9;

public class Task2 {
    public static void main(String[] args) {

        String a = "ABC";

        System.out.println(withoutFirstAndLastChar(a));

    }

    public static String withoutFirstAndLastChar(String inputString) {
        return inputString.substring(1,inputString.length()-1);
    }

}
