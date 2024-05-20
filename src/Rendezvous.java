import java.time.LocalTime;
import java.util.*;
public abstract class Rendezvous {
 protected  LocalTime  heuredebut;
 protected  LocalTime heurefin;
 protected String observation;
 protected String objectifs;
 protected List<Patient> patients;// pour les atelier
 public Rendezvous(LocalTime heuredebut,LocalTime heurefin,List<Patient> patients) {
  this.heuredebut=heuredebut;
  this.heurefin=heurefin;
  this.patients = new ArrayList<>();
  this.observation = "";
 }
 public LocalTime getHeuredebut(){
  return heuredebut;
 }
 public LocalTime getHeurefin(){
  return heurefin;
 }
 public void modifier(LocalTime heuredebut, LocalTime heurefin) {
  this.heuredebut= heuredebut;
 // this.type = type; pour consultation
  this.heurefin = heurefin;
 }
 public String consulterDetails() {
  return " Heure de Debut: " + heuredebut+ ", Heure de Fin: " + heurefin + ", Observation: " + observation + ", Patient:" + patients;
  //", Durée: " + duree + ", Patient: " + patient.getNom() +
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


