package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class Drums extends Instrument implements IPlay {

    private int numOfParts;

    public Drums(double buyPrice, double sellPrice, String material, String colour, String type, int numOfParts) {
        super(buyPrice, sellPrice, material, colour, type);
        this.numOfParts = numOfParts;
    }

    public int getNumOfParts() {
        return numOfParts;
    }
    public String play() {
        return "Badum tish";
    }


}
