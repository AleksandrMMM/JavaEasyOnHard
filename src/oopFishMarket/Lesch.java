package oopFishMarket;

public class Lesch extends Fish {

    @Override
    public void setPrice(int price) {
        if (isNoHead()){
            super.setPrice(price + 30);
        }else {
            super.setPrice(price);
        }

    }
}
