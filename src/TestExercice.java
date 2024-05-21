import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TestExercice extends Test {
    private HashSet<Exercice> exercices = new HashSet<Exercice>();
    private HashMap<Integer, Integer> repetitions = new HashMap<>(); // <indexExercice, nbRepetition>

    public TestExercice(String nom, int capacite, HashSet<Exercice> exercices, HashMap<Integer, Integer> repetitions) {
        super(nom, capacite);
        this.exercices = exercices;
        this.repetitions = repetitions;
    }
    public float calcScore(ArrayList<Integer> scores) {
        float score = 0;
        for (int i = 0; i <= scores.toArray().length; i++) {
            score += (float) scores.get(i) / repetitions.get(i);
        }
        return score;
    }
}

