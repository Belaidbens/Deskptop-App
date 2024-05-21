public class QCM extends Question {
    private String[] choix;
    private int[] reponce;

    public QCM(String enonce, String[] choix, int[] reponce) {
        super(enonce);
        this.choix = choix;
        this.reponce = reponce;
    }
}
