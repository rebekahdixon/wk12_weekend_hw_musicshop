package instruments;

public class Guitar extends Instrument {

    private int numberofStrings;

    public Guitar(String color, String material, FamilyType family, KindType type, double priceBought, double priceSell) {
        super(color, material, family, type, priceBought, priceSell);
    }

    public String play() {
        return "playing guitar";
    }
}
