package oopAutoService;

import java.time.Year;

public class Driver extends Human {

    private byte yearsDriver;

    private byte speedreaction;


    public byte getYearsDriver() {

        return yearsDriver;
    }

    public void setYearsDriver(byte yearsDriver) {
        if (years - yearsDriver >= 18){
            this.yearsDriver = yearsDriver;
        }
    }

    public byte getSpeedreaction() {
        return speedreaction;
    }

    public void setSpeedreaction(byte speedreaction) {
        this.speedreaction = speedreaction;
    }
}
