import instruments.*;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Drums drums;
    Guitars guitar;
    Keyboards keyboard;
    Pianos piano;
    Violins violin;

    @Before
    public void before() {
        drums = new Drums(600.00, 800.00, "Wood", "Black", "Acoustic", 7);
        guitar = new Guitars(300.00, 550.00, "Wood", "Red", "Electric", 6);
        keyboard = new Keyboards(600.00, 1000.00, "Metal", "Black", "Analogue", 52);
        piano = new Pianos(1500.00, 2000.00, "Oak", "White", "Grand", 52);
        violin = new Violins(250.00, 450.00, "Wood", "Brown", "Fiddle", 4);

    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(600.00, drums.getBuyPrice(),0.0);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(800.00, drums.getSellPrice(), 0.0);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", drums.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", drums.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("Acoustic", drums.getType());
    }

    @Test
    public void drumsHasNumOfParts() {
        assertEquals(7, drums.getNumOfParts());
    }

    @Test
    public void guitarHasNumOfStrings() {
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void keyboardHasNumOfKeys() {
        assertEquals(52, keyboard.getNumOfKeys());
    }

    @Test
    public void pianoHasNumOfKeys() {
        assertEquals(52, piano.getNumOfKeys());
    }

    @Test
    public void violinHasNumOfStrings() {
        assertEquals(4, violin.getNumOfStrings());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(200.00, drums.calculateMarkup(), 0.0);
    }
}
