import java.time.LocalDate;
import java.util.Date;

public class Enfant extends Patient{
    private  String Classeetude;
    private String telephonemom;
    public Enfant(String numeroDossier, String nom, String prenom, LocalDate dateDeNaissance, String adresse, String telephone, String email, String LieuDeNaissance, String Classeetude, String telephonemom) {
        super(nom, prenom, dateDeNaissance, adresse, telephone, email, LieuDeNaissance);
        this.Classeetude = Classeetude;
        this.telephonemom = telephonemom;
    }

}
