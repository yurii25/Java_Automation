package chapter6;

public class SmartphoneTester {
    public static void main(String[] args) {
        iOSSmartphone ios = new iOSSmartphone();
        AndroidSmartphone android = new AndroidSmartphone();

        System.out.println(ios.getOs());
        System.out.println(ios.getCharger());
        System.out.println(ios.getStoreName() + "\n");



        System.out.println(android.getOs());
        System.out.println(android.getCharger());
        System.out.println(android.getStoreName());



    }
}
