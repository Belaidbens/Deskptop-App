public class BilanOrthophonique {
    private boolean premier;
    private Epreuve[] epreuves;
    private Diagnostic diagnostic;
    private ProjectTherapeutique projectTherapeutique;

    public boolean isPremier() {
        return premier;
    }

    public Epreuve[] getEpreuves() {
        return epreuves;
    }

    public Diagnostic getDiagnostic() {
        return diagnostic;
    }

    public ProjectTherapeutique getProjectTherapeutique() {
        return projectTherapeutique;
    }

    public BilanOrthophonique(boolean premier, Epreuve[] epreuves, Diagnostic diagnostic, ProjectTherapeutique projectTherapeutique) {
        this.premier = premier;
        this.epreuves = epreuves;
        this.diagnostic = diagnostic;
        this.projectTherapeutique = projectTherapeutique;
    }
}