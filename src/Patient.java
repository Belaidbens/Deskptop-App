import java.time.*;
import java.util.*;
public  abstract class Patient {
    private int numeroDossier;
    private static int cpt=0;
    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String adresse;
    private String telephone;
    private String email;
    private String LieuDeNaissance;
    /*private List<RendezVous> rendezVous;
    private List<BilanOrthophonique.java> bilans;
    private List<FicheSuivi> fichesSuivi;*/
    public Patient(String nom, String prenom, LocalDate dateDeNaissance, String adresse, String telephone, String email, String LieuDeNaissance) {
       cpt++;
        this.numeroDossier = cpt;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.LieuDeNaissance=LieuDeNaissance;
        }

}
