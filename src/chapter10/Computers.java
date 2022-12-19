package chapter10;

public class Computers {
    public Computers(int id, String brand,String os, double price, String hardDrive){
        this.id = id;
        this.brand =brand;
        this.os = os;
        this.price = price;
        this.hardDrive = hardDrive;
    }




    int id;
    String brand;
    String os;
    double price;
    String hardDrive;

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getOs() {
        return os;
    }

    public double getPrice() {
        return price;
    }

    public String getHardDrive() {
        return hardDrive;
    }

}
