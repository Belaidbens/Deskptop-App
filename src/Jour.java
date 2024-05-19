import java.time.LocalDate;
import java.util.*;
public class Jour {
    private LocalDate date;
    private Rendezvous[] rdv;
    public Jour(LocalDate date,Rendezvous rdv){
        this.date=date;
        this.rdv= new Rendezvous[]{rdv};
    }


}
