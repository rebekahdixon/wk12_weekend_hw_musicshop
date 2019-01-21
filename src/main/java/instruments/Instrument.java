package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements ISell, IPlay {
    private String color;
    private String material;
    private FamilyType family;
    private KindType type;
    protected double priceBought;
    protected double priceSell;

    public Instrument(String color, String material, FamilyType family, KindType type, double priceBought, double priceSell) {
        this.color = color;
        this.material = material;
        this.family = family;
        this.type = type;
        this.priceBought = priceBought;
        this.priceSell = priceSell;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public FamilyType getFamily() {
        return family;
    }

    public KindType getType() {
        return type;
    }

    public double getPriceBought() {
        return priceBought;
    }

    public double getPriceSell() {
        return priceSell;
    }

    public double calculateMarkUp() {
        return priceSell -= priceBought;
    }
}
