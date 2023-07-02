package otherStock;

public class GuitarStrings extends ShopItems{

    public GuitarStrings(double buyPrice, double sellPrice) {
        super(buyPrice, sellPrice);
    }

    public double calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    }
}
