import java.util.ArrayList;

public class FicheSuivi {
    private Objective[] objectives;

    public Objective[] getObjectives() {
        return objectives;
    }

    public ArrayList[] getNotes() {
        return notes;
    }

    private ArrayList[] notes;

    public FicheSuivi(Objective[] objectives, ArrayList[] notes) {
        this.objectives = objectives;
        this.notes = notes;
    }
}
