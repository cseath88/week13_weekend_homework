package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class Keyboards extends Instrument implements IPlay, ISell {

    private int numOfKeys;

    public Keyboards(double buyPrice, double sellPrice, String material, String colour, String type, int numOfKeys) {
        super(buyPrice, sellPrice, material, colour, type);
        this.numOfKeys = numOfKeys;
    }

    public String play() {
        return " *plays 'The Touch' by Stan Bush* ";
    }

    public double calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }
}
