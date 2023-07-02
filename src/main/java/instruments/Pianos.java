package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class Pianos extends Instrument implements IPlay, ISell {

    private int numOfKeys;

    public Pianos(double buyPrice, double sellPrice, String material, String colour, String type, int numOfKeys) {
        super(buyPrice, sellPrice, material, colour, type);
        this.numOfKeys = numOfKeys;
    }

    public String play() {
        return " *plays some Chopin* ";
    }

    public double calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }
}
