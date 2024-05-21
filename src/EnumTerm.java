public enum EnumTerm {
    COURT("Court term"),
    MOYEN("Moyen term"),
    LONG("Long term");

    private final String description;
    EnumTerm(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
