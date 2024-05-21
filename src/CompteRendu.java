import java.util.ArrayList;

public class CompteRendu {
    private Test test;
    private ArrayList<Integer> scores = new ArrayList<Integer>();
    private String conclusion;

    public CompteRendu(Test test, ArrayList<Integer> scores, String conclusion) {
        this.test = test;
        this.scores = scores;
        this.conclusion = conclusion;
    }

    public Test getTest() {
        return test;
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }

    public String getConclusion() {
        return conclusion;
    }

    public float calcScoreTotal() {
        return this.test.calcScore(scores);
    }
}
