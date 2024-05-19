import java.time.*;

import java.util.*;

public class Consultation extends Rendezvous {

    public Consultation(LocalTime heuredebut, LocalTime heurefin, List<Patient> patients){
        super(heuredebut,heurefin, patients);
    }

}
