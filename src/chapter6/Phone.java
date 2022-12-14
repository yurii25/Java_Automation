package chapter6;

abstract class Phone {

    public void dialNumber(){
        System.out.println("The number is dialed");
    }

    abstract void setChargerType();

    abstract void setOperationSystem();

    abstract void setApplicationStore();
}
