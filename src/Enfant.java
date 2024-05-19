import java.util.Date;

public class Enfant extends Patient{
    private final String Classeetude;
    private final int telephonemom;
    public Enfant(String numeroDossier, String nom, String prenom, Date dateDeNaissance, String adresse, int telephone, String email, String LieuDeNaissance,String Classeetude, int telephonemom){
        super(  nom,  prenom,dateDeNaissance, adresse,telephone, email,LieuDeNaissance);
        this.Classeetude=Classeetude;
        this.telephonemom=telephonemom;
    }
}
