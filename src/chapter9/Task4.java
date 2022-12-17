/*
4. Взять последний символ в строке и вернуть новую строку с последним
символом, добавленным спереди и сзади, «cat» -> «tcatt».
public String backAround(String str) {}

"cat" → "tcatt"
"Hello" → "oHelloo"
"a" → "aaa"
 */

package chapter9;

public class Task4 {
    public static void main(String[] args) {

        String a = "Ace";

        System.out.println(backAround(a));

    }

    public static String backAround(String str) {

        return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);

    }
}
