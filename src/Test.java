import java.util.ArrayList;

public abstract class Test {
    private String nom;
    private int capacite;

    public abstract float calcScore(ArrayList<Integer> scores);

    public Test(String nom, int capacite) {
        this.nom = nom;
        this.capacite = capacite;
    }
}
