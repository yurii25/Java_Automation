package chapter1;

public class Task8 {
//    8. Given a mark on a Task01_CheckPassFail and the Task01_CheckPassFail total, find the percentage
//    Example:
//    Total Task01_CheckPassFail = 10;
//    marked Task01_CheckPassFail = 8;
//    Results: 80%
public static void main(String[] args) {
    int totalTest = 12;
    int markedTest = 9;

    double percentage = 100/totalTest * markedTest;
    System.out.println("The success rate of the Task01_CheckPassFail is " + percentage + "%");

}
}
