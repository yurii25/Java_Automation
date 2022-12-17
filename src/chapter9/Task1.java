/*
1. Написать метод который принимает в себя строку с несколькими словами и
возвращает строку с одним словом, которое идет за текущим в upper case
(например мы ищем строке “Get a modern feel with a smudge-resistant only for
$2.50, you can finish now” слово которой идет после слова “feel” (т.е. должен
вернуть “WITH” )

public String afterFellInUpperCase(String inputString) {}
 */

package chapter9;

public class Task1 {
    public static void main(String[] args) {

        String a = "Get a modern feel with a smudge-resistant only for $2.50, you can finish now";

        System.out.println(afterFellInUpperCase(a));

    }

    public static String afterFellInUpperCase(String inputString) {

        return inputString.substring(18,22).toUpperCase();

    }

}
