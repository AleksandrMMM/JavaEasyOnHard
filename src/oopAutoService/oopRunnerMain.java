package oopAutoService;

public class oopRunnerMain {

    public static void main(String[] args) {
        Car mers1 = new Mers();

        mers1.setCarName("Mers1");

        mers1.setHorseStrainght((short) 324);

        mers1.setSpeed(mers1.getHorseStrainght());

        mers1.setColor(Color.BLACK);

        System.out.println(mers1.getColor());

        System.out.println(mers1.getSpeed());

        System.out.println(mers1.getCarName());

    }

}
