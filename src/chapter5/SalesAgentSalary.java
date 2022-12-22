package chapter5;

public class SalesAgentSalary {
    private double salary;
    private int hours;
    private double rate;
    private int experience;
    private int salesQuantity;
    private double salesRevenue;

    public SalesAgentSalary(int hours, double rate) {
        setSalary(salaryCalculation(this.hours = hours, this.rate = rate));
//        this.hours = hours;
//        this.rate = rate;
    }
    public SalesAgentSalary(int hours, double rate, int experience, int salesQuantity, double salesRevenue) {
        setSalary(salaryCalculation(this.hours = hours, this.rate = rate));
        experienceRatioCalculation(this.experience = experience);
        bonusOrFineCalculation(this.salesQuantity = salesQuantity);
        bonusCalculation(this.salesRevenue = salesRevenue);
//        this.hours = hours;
//        this.rate = rate;
//        this.experience = experience;
//        this.salesQuantity = salesQuantity;
//        this.salesRevenue = salesRevenue;
    }



    public static double salaryCalculation (int hours, double rate){
        double ratio = 1.5;
        double workShift = 160;

        if (hours > workShift){
            double salary = rate + (hours - workShift) * ratio;
            return salary;
        }else return rate;

    }
    public static double experienceRatioCalculation(int experience) {
        double experienceRatio = 0;
        if (experience <= 2) {
            return 1;
        } else if (2 < experience && experience <= 4) {
            return 1.2;
        } else if (4 < experience && experience <= 6) {
            return 1.3;
        } else if (experience > 6) {
            return 1.4;
        }
        return experienceRatio;
    }
    public static double bonusOrFineCalculation (int salesQuantity){
        double bonus;
        if (salesQuantity > 20){
            bonus = 250;
        }else if (salesQuantity < 10){
            bonus = -150;
        }else bonus = 0;

        return bonus;
    }
    public static double bonusCalculation (double salesRevenue){
        double bonus = 0;
        if(salesRevenue > 15000){
            bonus = 250;
        }
        return bonus;
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

    public double getRate() {
        return rate;
    }

    public int getExperience() {
        return experience;
    }

    public int getSalesQuantity() {
        return salesQuantity;
    }
    public double getSalesRevenue() {
        return salesRevenue;
    }

}
