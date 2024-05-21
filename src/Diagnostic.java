public class Diagnostic {
    private String nom;
    private EnumTrouble trouble;

    public Diagnostic(String nom, EnumTrouble trouble) {
        this.nom = nom;
        this.trouble = trouble;
    }

    public String getNom() {
        return nom;
    }

    public EnumTrouble getTrouble() {
        return trouble;
    }
}
