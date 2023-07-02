package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private double buyPrice;

    private double sellPrice;
    private String material;
    private String colour;
    private String type;

    public Instrument(double buyPrice, double sellPrice, String material, String colour, String type) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }
    public String getColour() {
        return colour;
    }
    public String getType() {
        return type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup(){
        return sellPrice - buyPrice;
    }

}
