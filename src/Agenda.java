

import java.util.*;
import java.time.*;

public class Agenda {

    private Map<LocalDate, Jour> jours;

    public Agenda() {
        this.jours = new HashMap<>();
    }

    public boolean estDisponible(LocalDate date, Rendezvous nouveauRdv) {
        Jour jour = jours.getOrDefault(date, new Jour(date));
        return jour.estDisponible(nouveauRdv);
    }

    public void ajouterRendezvous(LocalDate date, Rendezvous nouveauRdv) {
        Jour jour = jours.getOrDefault(date, new Jour(date));
        jour.ajouterRendezvous(nouveauRdv);
        jours.put(date, jour);
    }

    public Jour getJour(LocalDate date) {
        return jours.get(date);
    }

    public void afficherAgenda() {
        if (jours.isEmpty()) {
            System.out.println("Aucun rendez-vous programmé.");
            return;
        }

        for (LocalDate date : jours.keySet()) {
            System.out.println("Date: " + date);
            Jour jour = jours.get(date);
            for (Rendezvous rdv : jour.getRdv()) {
                System.out.println(rdv.consulterDetails());
            }
            System.out.println();
        }
    }
}




