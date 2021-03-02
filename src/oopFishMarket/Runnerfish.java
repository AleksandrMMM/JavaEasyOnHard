package oopFishMarket;

public class Runnerfish {

    public static void main(String[] args) {

        Ocun ocun1 = new Ocun();
        ocun1.setName("ocunek");

        ocun1.setNoHead(true);

        ocun1.setPrice(43);

        System.out.println(ocun1.getPrice());

        User user = new User();
        user.setRole(Role.CUSTOMER);
        user.setSecondName("Ivanov");

        System.out.println(user);


    }
}
