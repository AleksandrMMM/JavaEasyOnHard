package oopAutoService;

public class Car {

    protected Transmission transmission;

    protected Door door;

    protected String color;

    protected double weigth;

    protected short speed;

    protected short horseStrainght;

    protected String carName;

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public String getColor() {
        return color;
    }

    public void setColor(Color color) {


        this.color = color.getCol();;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short horseStrainght) {

        this.speed = (short) (horseStrainght + 25 * 24/4);
    }

    public short getHorseStrainght() {
        return horseStrainght;
    }

    public void setHorseStrainght(short horseStrainght) {
        this.horseStrainght = horseStrainght;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
