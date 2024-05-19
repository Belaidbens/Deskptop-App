import java.time.LocalTime;
import java.util.List;

public class Suivi extends Rendezvous{
    private TYPERDV type;
    private int numeroDossier;

    public Suivi(LocalTime heuredebut, LocalTime heurefin, List<Patient> patients,int numeroDossier) {
        super(heuredebut, heurefin, patients);
        this.numeroDossier=numeroDossier;
        
    }


}
