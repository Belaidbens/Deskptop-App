public class Epreuve {
    private String observation;
    private Test[] tests;
    private CompteRendu[] compteRendus;

    public String getObservation() {
        return observation;
    }

    public Test[] getTests() {
        return tests;
    }

    public CompteRendu[] getCompteRendus() {
        return compteRendus;
    }

    public Epreuve(String observation, Test[] tests, CompteRendu[] compteRendus) {
        this.observation = observation;
        this.tests = tests;
        this.compteRendus = compteRendus;
    }
}
