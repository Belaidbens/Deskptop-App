

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
     Orthophoniste ortho=new Orthophoniste("Belaid","Bensaada","Bejaia","mm_bensaada@esi.dz","0656268495","123456789@");
     Patient p1=new Enfant("0550482015","eee","eeep",LocalDate.of(2005, Month.JUNE, 5),"Alger", "055487951","eee.p@gmail.com","setif","1As","02310148");
     Patient p2=new Adulte("aaa","aaap",LocalDate.of(1991, Month.MARCH, 17),"Alger","0698754123","aaa.ap@gmail.com","Qatar","majister en electronique","ingenieur en elecf");



    }
}
