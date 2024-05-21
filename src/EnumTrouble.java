public enum EnumTrouble {
    DEGLUTITION("Trouble de deglutition"),
    NEURO_DEVELOPPEMENTAUX("Trouble neuro_developpementaux"),
    COGNITIF("Trouble cognitif");

    private final String description;
    EnumTrouble(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
