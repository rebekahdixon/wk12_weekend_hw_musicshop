package ItemType;

public enum ItemType {
    DRUMSTICKS("Drumsticks"),
    GUITARSTRINGS("Guitar Strings"),
    SHEETMUSIC("Sheet Music");

    private final String name;

    ItemType(String name) {
        this.name = name;
    }
}
