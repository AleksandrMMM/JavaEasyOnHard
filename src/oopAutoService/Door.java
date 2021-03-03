package oopAutoService;

public enum Door {

    CUPE("купе"), UNIVERSAL("универсал"), FOUR_DOOR("четыре двери");

    String door;

    Door(String door){

        this.door = door;

    }

    public String getDoor() {
        return door;
    }
}
