package otherStock;

public class Microphones extends ShopItems{

    public Microphones(double buyPrice, double sellPrice) {
        super(buyPrice, sellPrice);
    }

    public double calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    }
}
