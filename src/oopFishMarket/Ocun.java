package oopFishMarket;

public class Ocun extends Fish {

    @Override
    public void setPrice(double price) {
        if (isNoHead()){
           this.price = price + 10;
        }else {
            this.price = price;
        }

    }
}
