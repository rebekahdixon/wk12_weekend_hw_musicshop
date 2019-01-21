package instruments;

public enum FamilyType {
    BRASS("Brass"),
    WIND("Wind"),
    PERCUSSION("Percussion"),
    STRING("String");

    private final String familyName;

    FamilyType(String familyName) {
        this.familyName = familyName;
    }

}
