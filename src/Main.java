import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cabinet cabinet = new Cabinet(
            new Orthophoniste("Belaid", "Bensaada", "Bejaia", "656268495", "mm_bensaada@esi.dz", "123456789@")
        );

        Orthophoniste ortho;
        try {
            ortho = cabinet.connect("mm_bensaada@esi.dz", "123456789@");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        Patient p1 = new Enfant("0550482015", "eee", "eeep", LocalDate.of(2005, Month.JUNE, 5), "Alger", "055487951", "eee.p@gmail.com", "setif", "1As", "02310148");
        Patient p2 = new Adulte("aaa", "aaap", LocalDate.of(1991, Month.MARCH, 17), "Alger", "0698754123", "aaa.ap@gmail.com", "Qatar", "majister en electronique", "ingenieur en elecf");

        List<Patient> ps1 = new ArrayList<>();
        ps1.add(p1);
        Consultation rdv1 = new Consultation(LocalTime.of(8, 30), LocalTime.of(9, 30), ps1);

        List<Patient> ps2 = new ArrayList<>();
        ps2.add(p1);
        ps2.add(p2);
        Atelier rdv2 = new Atelier(LocalTime.of(12, 0), LocalTime.of(14, 30), ps2, "apprentissage de deglutition");

        Atelier rdv5 = new Atelier(LocalTime.of(12, 0), LocalTime.of(14, 30), ps2, "apprentissage de deglutition");

        System.out.println("===========================================");
        LocalDate date1 = LocalDate.of(2024, 5, 26);
        ortho.programmerRendezvous(date1, rdv1);
        ortho.programmerRendezvous(date1, rdv2);
        ortho.programmerRendezvous(date1, rdv5);

        ortho.afficherAgenda();
        System.out.println("===========================================");



        System.out.println("===========================================");
    }
}