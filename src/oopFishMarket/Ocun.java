package oopFishMarket;

public class Ocun extends Fish {

    @Override
    public void setPrice(int price) {
        if (isNoHead()){
           setPrice(price + 10);
        }else {
            setPrice(price);
        }

    }
}
