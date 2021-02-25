package oopFishMarket;

public class Chuka extends Fish{

    @Override
    public void setPrice(int price) {
        if (isNoHead()){
            setPrice(price + 20);
        }else {
            setPrice(price);
        }

    }
}
