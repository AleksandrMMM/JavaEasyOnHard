package oopAutoService;

public class Mers extends Car {

    @Override
    public void setSpeed(short horseStrainght) {

        speed = (short) (horseStrainght + 25 * 24/4  + 40);
    }
}
