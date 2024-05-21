import java.util.ArrayList;
import java.util.HashSet;

public class TestQuestionnaire extends Test {
    private HashSet<Question> questions = new HashSet<>();

    public TestQuestionnaire(String nom, int capacite, HashSet<Question> questions) {
        super(nom, capacite);
        this.questions = questions;
    }

    public float calcScore(ArrayList<Integer> scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum;
    }
}
