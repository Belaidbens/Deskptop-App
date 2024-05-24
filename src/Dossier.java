import java.util.ArrayList;

public class Dossier {
    private int numero;
    private static int index = 0;
    private ArrayList<Rendezvous> rendezvous = new ArrayList<>();
    private ArrayList<BilanOrthophonique> bilanOrthophoniques = new ArrayList<>();
    private ArrayList<FicheSuivi> ficheSuivis = new ArrayList<>();
    private Patient patient;

    public Dossier(Patient patient) {
        this.numero = index++;
        this.patient = patient;
    }

    public void addRendezVous(Rendezvous rendezvous) {
        this.rendezvous.add(rendezvous);
    }
    public void addBilan(BilanOrthophonique bilan) {
        this.bilanOrthophoniques.add(bilan);
    }

    public int getNumero() {
        return numero;
    }

    public Patient getPatient() {
        return patient;
    }

    public ArrayList<Rendezvous> getRendezvous() {
        return rendezvous;
    }

    public ArrayList<BilanOrthophonique> getBilanOrthophoniques() {
        return bilanOrthophoniques;
    }

    public ArrayList<FicheSuivi> getFicheSuivis() {
        return ficheSuivis;
    }

    public void addFicheSuivi(FicheSuivi fiche) {
        this.ficheSuivis.add(fiche);
    }
}
