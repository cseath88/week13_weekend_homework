package otherStock;

import interfaces.ISell;

public class Cables extends ShopItems implements ISell {

    public Cables(double buyPrice, double sellPrice) {
        super(buyPrice, sellPrice);

    }

    public double calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    }
}
