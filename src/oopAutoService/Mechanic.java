package oopAutoService;

public class Mechanic extends Human{

    private byte yearsExp;

    private String markAuto;


    public byte getYearsExp() {
        return yearsExp;

    }

    public void setYearsExp(byte yearsExp) {
        if (yearsExp - years > 0){
            this.yearsExp = yearsExp;
        }
    }

    public String getMarkAuto() {
        return markAuto;
    }

    public void setMarkAuto(String markAuto) {
        this.markAuto = markAuto;
    }
}
