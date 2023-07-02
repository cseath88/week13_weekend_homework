package otherStock;

public abstract class ShopItems {

    private double buyPrice;
    private double sellPrice;

    public ShopItems(double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
