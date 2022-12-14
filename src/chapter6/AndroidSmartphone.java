package chapter6;

public class AndroidSmartphone extends Phone{
    public AndroidSmartphone(){
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
        os ="The operation system is Android";
    }



    private String charger;

    public String getCharger() {
        return charger;
    }
    @Override
    void setChargerType(){
        charger = "The charger type is the Type-C";
    }



    private String storeName;
    public String getStoreName() {
        return storeName;
    }
    @Override
    void setApplicationStore() {
        storeName ="The application store is the Play Market";
    }

}
