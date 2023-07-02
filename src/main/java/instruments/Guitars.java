package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class Guitars extends Instrument implements IPlay, ISell {

    private int numOfStrings;

    public Guitars(double buyPrice, double sellPrice, String material, String colour, String type, int numOfStrings) {
        super(buyPrice, sellPrice, material, colour, type);
        this.numOfStrings = numOfStrings;
    }

    public String play() {
        return "Strummy strum strum";
    }

    public double calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }
}
