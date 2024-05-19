import java.util.*;
public  abstract class Patient {
    private int numeroDossier;
    private static int cpt=0;
    private String nom;
    private String prenom;
    private Date dateDeNaissance;
    private String adresse;
    private int telephone;
    private String email;
    private String LieuDeNaissance;
    /*private List<RendezVous> rendezVous;
    private List<BilanOrthophonique> bilans;
    private List<FicheSuivi> fichesSuivi;*/
    public Patient( String nom, String prenom, Date dateDeNaissance, String adresse, int telephone, String email,String LieuDeNaissance) {
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
