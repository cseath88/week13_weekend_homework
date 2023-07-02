package otherStock;

import interfaces.ISell;

public class DrumSticks extends ShopItems implements ISell {

    public DrumSticks(double buyPrice, double sellPrice) {
        super(buyPrice, sellPrice);
    }

    public double calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    }
}
