import java.time.LocalTime;
import java.util.List;

public class Suivi extends Rendezvous{
    private TYPERDV type;
    private int numeroDossier;

    public Suivi(LocalTime heuredebut, LocalTime heurefin, List<Patient> patients,int numeroDossier,TYPERDV type) {
        super(heuredebut, heurefin, patients);
        this.numeroDossier=numeroDossier;
        this.type=type;
    }
    public LocalTime getHeuredebut(){
        return heuredebut;
    }
    public LocalTime getHeurefin(){
        return heurefin;
    }
    public void modifier(LocalTime heuredebut, LocalTime heurefin,TYPERDV type) {
        this.heuredebut= heuredebut;
         this.type = type;
        this.heurefin = heurefin;
    }
    public String consulterDetails() {
        return " Heure de Debut: " + heuredebut+ ", Heure de Fin: " + heurefin + ", Observation: " + observation + ", Patient:" + patients;
        //", Durée: " + duree + ", Patient: " + patient.getNom() +
    }
    public void ajouterObservation(String observation) {
        this.observation = observation;
    }


}
