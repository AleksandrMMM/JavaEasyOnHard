package oopAutoService;

public class Lada extends Car {

    @Override
    public void setSpeed(short horseStrainght) {

        speed = (short) (horseStrainght + 25 * 24/4  - 10);
    }
}
