package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("black", "wood", FamilyType.STRING, KindType.GUITAR, 35, 75);
    }

    @Test
    public void getPriceBought() {
        assertEquals(35, guitar.getPriceBought(), 0.01);
    }

    @Test
    public void getPriceSell() {
        assertEquals(75, guitar.getPriceSell(), 0.01);

    }

    @Test
    public void canGetProfit() {
        assertEquals(40, guitar.calculateMarkUp(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("playing guitar", guitar.play());
    }
}