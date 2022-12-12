package chapter1;

public class Task9 {
/*
9. Получение ипотеки
Имеем 2 переменные - возраст мужа и жены
Написать boolean - который возвращает true, если им обоим менее 35 лет (логические
выражения и операторы сравнения), если кому то больше, то false
 */
    public static void main(String[] args) {
        int approvalMaxAge = 35;

        int husbandAge = 40;
        int wifeAge = 34;
        boolean mortgageApproval;

        // не врахований кейс, коли двом по 35 років, так як в умові про це нічого не сказано

        if (husbandAge < approvalMaxAge && wifeAge < approvalMaxAge){
            mortgageApproval = true;
        }else {
            mortgageApproval = false;
        }
        System.out.println("Mortgage approval: " + mortgageApproval);

}
}
