package shop;

import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        stock = new ArrayList<>();
    }

    public void addStock(ISell item) {
        stock.add(item);
    }

    public void removeFromStock(ISell item) {
        stock.remove(item);
    }

    public int getStockSize() {
        return stock.size();
    }

    public double calculateProfit() {
        double totalProfit = 0.0;
        for (ISell item : stock) {
            totalProfit += item.calculateMarkup();
        }
        return totalProfit;
    }
}
