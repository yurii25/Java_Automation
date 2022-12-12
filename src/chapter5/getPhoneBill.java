package chapter5;

public class getPhoneBill {
    private double additionalMb;
    private double minutesInsideRoaming;
    private double smsQuantity;
    private int zone;
    private double minutesOutsideRoaming;

    public getPhoneBill(double additionalMb, double minutesInsideRoaming, double smsQuantity,
                        int zone, double minutesOutsideRoaming){
        this.additionalMb = additionalMb;
        this.minutesInsideRoaming = minutesInsideRoaming;
        this.smsQuantity = smsQuantity;
        this.zone = zone;
        this.minutesOutsideRoaming = minutesOutsideRoaming;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public double getMinutesOutsideRoaming() {
        return minutesOutsideRoaming;
    }

    public void setMinutesOutsideRoaming(double minutesOutsideRoaming) {
        this.minutesOutsideRoaming = minutesOutsideRoaming;
    }

    public double getSmsQuantity() {
        return smsQuantity;
    }

    public void setSmsQuantity(double smsQuantity) {
        this.smsQuantity = smsQuantity;
    }

    public double getAdditionalMb() {
        return additionalMb;
    }

    public void setAdditionalMb(double additionalMb) {
        this.additionalMb = additionalMb;
    }

    public double getMinutesInsideRoaming() {
        return minutesInsideRoaming;
    }

    public void setMinutesInsideRoaming(double minutesInsideRoaming) {
        this.minutesInsideRoaming = minutesInsideRoaming;
    }



    public static double additionalMbCalculation (double additionalMb){
        double a = 0;
        if(additionalMb > 8000) {
            for (double i = 8000; i < additionalMb; i = i + 500) {
                a = a + 50;
            }
        }return a;
    }

    public static double ukraineCallsCalculation (double minutesInsideRoaming){
        double ukraineCallRatio = 0.75;
        double ukraineCallsCost;
        if(minutesInsideRoaming <= 500){
            ukraineCallRatio = 0.5;
            ukraineCallsCost = minutesInsideRoaming * ukraineCallRatio;
            return ukraineCallsCost;
        }else ukraineCallsCost = ukraineCallRatio * minutesInsideRoaming;
        return ukraineCallsCost;
    }

    public static double smsCalculation (double smsQuantity){
        double smsPrice = 1.5;
        double smsCost;
        if(smsQuantity <= 50){
            smsPrice = 1;
            smsCost = smsPrice * smsQuantity;
            return smsCost;
        }else smsCost = smsPrice * smsQuantity;
        return smsCost;
    }

    public static double foreignCallsCalculation (int zone, double minutesOutsideRoaming){
        double zoneRatio;
        double callsCost = 0;
        if(zone == 1){
            zoneRatio = 1.5;
            callsCost = minutesOutsideRoaming * zoneRatio;
            return callsCost;
        }else if (zone == 2){
            zoneRatio = 1.5;
            callsCost = minutesOutsideRoaming * zoneRatio;
            return callsCost;
        }else return callsCost;
    }
}
