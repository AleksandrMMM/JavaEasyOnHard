package oopFishMarket;

public class Fish {

    protected String name;

    protected byte weight;

    protected double price;

    protected boolean noHead;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getWeight() {
        return weight;
    }

    public void setWeight(byte weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNoHead() {
        return noHead;
    }

    public void setNoHead(boolean noHead) {
        this.noHead = noHead;
    }
}
