package oopAutoService;

public enum Color {

    BLACK("черный"), WHITE("белый"), RED("красный"), BLUE("синий"), GREEN("зеленый");

    String color;

     Color(String color){

     this.color = color;

    }

    public String getCol() {
        return color;
    }
}
