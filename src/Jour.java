import java.time.LocalDate;
import java.util.*;
public class Jour {
    private LocalDate date;
    private List<Rendezvous> rdv;
    public Jour(LocalDate date){
        this.date=date;
        this.rdv = new ArrayList<>();

    }
    public boolean estDisponible(Rendezvous nouveauRdv) {
        for (Rendezvous r : rdv) {
            if (nouveauRdv.getHeuredebut().isBefore(r.getHeurefin()) && nouveauRdv.getHeurefin().isAfter(r.getHeuredebut())) {
               // return false; // Conflit d'horaires
                System.out.println(false);
            }
        }
        return true;
    }
    public void ajouterRendezvous(Rendezvous nouveauRdv) {
        if (estDisponible(nouveauRdv)) {
            rdv.add(nouveauRdv);
        } else {
            System.out.println("Le créneau est déjà pris pour ce rendez-vous.");
        }
    }
    public List<Rendezvous> getRdv() {
        return rdv;
    }


}
