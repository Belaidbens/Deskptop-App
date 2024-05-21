public class Objective {
    private String nom;
    private EnumTerm term;

    public String getNom() {
        return nom;
    }

    public EnumTerm getTerm() {
        return term;
    }

    public Objective(String nom, EnumTerm term) {
        this.nom = nom;
        this.term = term;
    }
}
