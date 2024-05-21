import java.util.ArrayList;

public class Exercice {
    private String consigne;
    private String[] materials;

    public String getConsigne() {
        return consigne;
    }

    public String[] getMaterials() {
        return materials;
    }

    public Exercice(String consigne, String[] materials) {
        this.consigne = consigne;
        this.materials = materials;
    }
}
