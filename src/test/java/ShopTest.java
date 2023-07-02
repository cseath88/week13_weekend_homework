import instruments.Drums;
import instruments.Guitars;
import instruments.Keyboards;
import org.junit.Before;
import org.junit.Test;
import otherStock.Cables;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Drums drums;
    Guitars guitar;
    Cables cables;
    Keyboards keyboard;

    @Before
    public void before() {
        shop = new Shop();
        drums = new Drums(600.00, 800.00, "Wood", "Black", "Acoustic", 7);
        guitar = new Guitars(300.00, 550.00, "Wood", "Red", "Electric", 6);
        keyboard = new Keyboards(600.00, 1000.00, "Metal", "Black", "Analogue", 52);
        cables = new Cables(3.00, 6.00);
    }

    @Test
    public void canAddItemToStock(){
        shop.addStock(drums);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addStock(drums);
        shop.removeFromStock(drums);
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void canCalculateTotalProfit() {
        shop.addStock(cables);
        shop.addStock(guitar);
        shop.addStock(keyboard);
        assertEquals(653.00, shop.calculateProfit(), 0.0);
    }

}
