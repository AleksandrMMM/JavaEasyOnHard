package oopFishMarket;

public class Karas extends Fish {

    @Override
    public void setPrice(int price) {
        if (isNoHead()){
            setPrice(price + 15);
        }else {
            setPrice(price);
        }

    }


}
