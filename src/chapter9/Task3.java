/*
3. Если длина строки меньше или равно 3, то она остается без изменений. Если
больше 3, то нужно вернуть новую строку, которая составляет 3 копии первых
трех символов

public String repeatRepeatRepeat(String inputString ) { }

"Java" → "JavJavJav"
"Chocolate" → "ChoChoCho"
"abc" → "abс"
 */

package chapter9;

public class Task3 {
    public static void main(String[] args) {

        String v = "Java";

        System.out.println(repeatRepeatRepeat(v));

    }

    public static String repeatRepeatRepeat(String inputString ) {

        if (inputString.length() <= 3){
            return inputString;
        }else
            return inputString.substring(0,3) + inputString.substring(0,3) + inputString.substring(0,3);

    }
}
