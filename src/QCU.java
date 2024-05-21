public class QCU extends Question{
    private String[] choix;
    private int reponce;

    public QCU(String enonce, String[] choix, int reponce) {
        super(enonce);
        this.choix = choix;
        this.reponce = reponce;
    }
}
