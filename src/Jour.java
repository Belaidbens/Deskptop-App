import java.time.LocalDate;
import java.util.*;
public class Jour {
    private LocalDate date;
    private List<Rendezvous> rdv;
    public Jour(LocalDate date){
        this.date=date;

    }
    public boolean estDisponible(Rendezvous nouveauRdv) {
        for (Rendezvous r : rdv) {
            if (nouveauRdv.getHeuredebut().isBefore(r.getHeurefin()) && nouveauRdv.getHeurefin().isAfter(r.getHeuredebut())) {
                return false; // Conflit d'horaires
            }
        }
        return true;
    }
    public void ajouterRendezvous(Rendezvous nouveauRdv) {
        rdv.add(nouveauRdv);
    }
    public List<Rendezvous> getRdvdv() {
        return rdv;
    }


}
