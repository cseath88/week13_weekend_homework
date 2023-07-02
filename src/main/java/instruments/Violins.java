package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class Violins extends Instrument implements IPlay, ISell {

    private int numOfStrings;

    public Violins(double buyPrice, double sellPrice, String material, String colour, String type, int numOfStrings) {
        super(buyPrice, sellPrice, material, colour, type);
        this.numOfStrings = numOfStrings;
    }

    public String play() {
        return "* plays tiny violin *";
    }

    public double calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }
}
