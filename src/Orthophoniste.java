import java.util.*;
import java.time.*;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Orthophoniste {
    private String nom;
    private String prenom;
    private String adresse;
    private String mail;
    private String telephone;
    private String passwordHash;
    private Rendezvous rdv;
    private Jour jr;
    private Agenda agenda;
    private HashMap<Integer, Dossier> dossiers = new HashMap<>();

    public static String hashPassword(String password) {
        try {
            String hexString = "a3dcb4d229de6fde0db5686dee47145d";
            int iterations = 65536;
            int keyLength = 512;

            char[] passwordChars = password.toCharArray();
            byte[] salt = hexStringToByteArray(hexString);
            PBEKeySpec spec = new PBEKeySpec(passwordChars, salt, iterations, keyLength);
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
            byte[] hashedPassword = skf.generateSecret(spec).getEncoded();

            StringBuilder sb = new StringBuilder();
            for (byte b : hashedPassword) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] hexStringToByteArray(String hexString) {
        int length = hexString.length();
        byte[] byteArray = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            byteArray[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4)
                    + Character.digit(hexString.charAt(i+1), 16));
        }
        return byteArray;
    }

    public Orthophoniste(String nom, String prenom, String adresse, String telephone, String mail, String motdepasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.telephone = telephone;
        this.agenda = new Agenda();
        this.passwordHash = hashPassword(motdepasse);
    }

    public Dossier getDossier(int nbDossier) {
        return this.dossiers.get(nbDossier);
    }

    public void setDossier(int nbDossier, Dossier dossier) {
        this.dossiers.put(nbDossier, dossier);
    }

    public void afficherorthophoniste() {
        System.out.println("nom : " + nom);
    }

    public boolean auth(String password) {
        String passwordHash = hashPassword(password);
        passwordHash = hashPassword(password);
        return this.passwordHash.equals(passwordHash);
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getMail() {
        return mail;
    }

    public String getTelephone() {
        return telephone;
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

    public void afficherAgenda() {
        agenda.afficherAgenda();
    }
}
