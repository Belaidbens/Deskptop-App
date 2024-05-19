import java.time.LocalTime;
import java.util.*;
public abstract class Rendezvous {
 private  LocalTime  heuredebut;
 private  LocalTime heurefin;
 private String observation;
 private String objectifs;
 private List<Patient> patients;// pour les atelier
 public Rendezvous(LocalTime heuredebut,LocalTime heurefin,List<Patient> patients) {
  this.heuredebut=heuredebut;
  this.heurefin=heurefin;
  this.patients = new ArrayList<>();
  this.observation = "";
 }
 public void ajouterObservation(String observation) {
  this.observation = observation;
 }

 public void ajouterPatient(Patient patient) {
  patients.add(patient);
 }

 public List<Patient> getPatients() {
  return patients;
 }
 public String getObservation() {
  return observation;
 }
}


