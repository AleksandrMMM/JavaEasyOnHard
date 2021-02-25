package oopFishMarket;

public class Karas extends Fish {

    @Override
    public void setPrice(int price) {
        if (isNoHead()){
            super.setPrice(price + 25);
        }else {
            super.setPrice(price);
        }

    }


}
