import ItemType.ItemType;
import behaviours.ISell;

public class Item implements ISell {

    private ItemType type;
    protected double priceSell;
    protected double priceBuy;

    public Item(ItemType type, double priceSell, double priceBuy) {
        this.type = type;
        this.priceSell = priceSell;
        this.priceBuy = priceBuy;
    }

    public double getPriceSell() {
        return priceSell;
    }

    public double calculateMarkUp() {
        return priceSell -= priceBuy;
    }
}
