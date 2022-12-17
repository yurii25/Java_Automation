package chapter5;

public class SalesAgentSalary {
    private double salary;
    private int hours;
    private double rate;
    private int experience;
    private int salesQuantity;
    private double salesRevenue;

    public SalesAgentSalary(int hours, double rate) {
        setSalary(salary);
        this.hours = hours;
        this.rate = rate;
    }
    public SalesAgentSalary(int hours, double rate, int experience, int salesQuantity, double salesRevenue) {
        setSalary(salary);
        this.hours = hours;
        this.rate = rate;
        this.experience = experience;
        this.salesQuantity = salesQuantity;
        this.salesRevenue = salesRevenue;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(int salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public double getSalesRevenue() {
        return salesRevenue;
    }

    public void setSalesRevenue(double salesRevenue) {
        this.salesRevenue = salesRevenue;
    }

}
