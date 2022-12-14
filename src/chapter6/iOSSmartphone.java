package chapter6;

/*
Для примера у IOSSmartphone есть приватное поле String os, в методе
setOperationSystem() сетится его значение, потом этот метод вызываем а
конструкторе после этого в классе SmartphoneTester создаем ссылку и
вызываем getOperationSystem() После этого выводим в консоль
 */

public class iOSSmartphone extends Phone{

    public iOSSmartphone(){
        setOperationSystem();
        setChargerType();
        setApplicationStore();
    }

    private String os;
    public String getOs() {
        return os;
    }
    @Override
    void setOperationSystem() {
        os ="The operation system is iOS";
    }



    private String charger;

    public String getCharger() {
        return charger;
    }
    @Override
    void setChargerType(){
        charger = "The charger type is the Lightning";
    }



    private String storeName;
    public String getStoreName() {
        return storeName;
    }
    @Override
    void setApplicationStore() {
        storeName ="The application store is the App Store";
    }

}
