package instruments;

public enum KindType {
    GUITAR("guitar"),
    TRUMPET("Trumpet"),
    VIOLIN("Violin"),
    DRUMS("Drum");

    private final String typeOfInstrument;

    KindType(String typeOfInstrument) {
        this.typeOfInstrument = typeOfInstrument;
    }
}
