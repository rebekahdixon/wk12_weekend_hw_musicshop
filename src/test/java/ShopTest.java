import ItemType.ItemType;
import behaviours.ISell;
import instruments.FamilyType;
import instruments.Guitar;
import instruments.KindType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Item guitarStrings;
    Item sheetMusic;
    ArrayList<ISell> stock;

    @Before
    public void setUp() {
        guitarStrings = new Item(ItemType.GUITARSTRINGS, 10, 4);
        sheetMusic = new Item(ItemType.SHEETMUSIC, 30, 12);
        guitar = new Guitar("black", "wood", FamilyType.STRING, KindType.GUITAR, 35, 75);
        shop = new Shop("Rebekah's Music");
    }

    @Test
    public void addStockItem() {
        shop.addStockItem(guitar);
        shop.addStockItem(sheetMusic);
        shop.addStockItem(guitarStrings);
        assertEquals(3, shop.countStock());
    }

    @Test
    public void removeStockItem() {
        shop.addStockItem(guitar);
        shop.addStockItem(sheetMusic);
        shop.addStockItem(guitarStrings);
        assertEquals(3, shop.countStock());
        shop.removeStockItem(guitarStrings);
        assertEquals(2, shop.countStock());

    }

    @Test
    public void canGetTotalProfitForShop(){
        shop.addStockItem(guitar);
        shop.addStockItem(sheetMusic);
        shop.addStockItem(guitarStrings);
        assertEquals(3, shop.countStock());
        assertEquals(64, shop.getTotalProfit(), 0.01);
    }
}