import java.util.*;
import java.time.*;
public class Orthophoniste {
    private String nom;
    private String prenom;
    private String adresse;
    private String mail;
    private String telephone;
    private String motdepasse;
    private Rendezvous rdv;
    private Jour jr;
    private Agenda agenda;
    public Orthophoniste(String nom, String prenom, String adresse, String mail, String telephone,String motdepasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.telephone = telephone;
        this.motdepasse=motdepasse;
        this.agenda = new Agenda();
    }
    public Orthophoniste creercompte(String nom, String prenom, String adresse, String mail, String telephone,String motdepasse){
            Orthophoniste ortho;
        return ortho= new Orthophoniste( nom,  prenom,  adresse,  mail,  telephone, motdepasse);
    }
    public boolean seConnecter(String email, String motDePasse) {
        return this.mail.equals(email) && this.motdepasse.equals(motDePasse);
    }

    public boolean programmerRendezvous(LocalDate date, Rendezvous nouveauRdv) {
        if (agenda.estDisponible(date, nouveauRdv)) {
            agenda.ajouterRendezvous(date, nouveauRdv);
            return true;
        } else {
            System.out.println("Rendez-vous non disponible pour cette date et heure.");
            return false;
        }
    }
}
