/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kunal
 */
public class Encounter {
    private String encounter;
    private String vitalSign;
    private String timeSlot;
    private String doctor;
    private String symptom;
    private String diagnosis; 
    private String medicine;

    @Override
    public String toString() {
        return  encounter;
    }

    public Encounter(String encounter, String vitalSign, String timeSlot, String doctor, String symptom, String diagnosis, String medicine) {
        this.encounter = encounter;
        this.vitalSign = vitalSign;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
        this.symptom = symptom;
        this.diagnosis = diagnosis;
        this.medicine = medicine;
        
    }

   
    public String getEncounter() {
        return encounter;
    }

    public void setEncounter(String encounter) {
        this.encounter = encounter;
    }

    public String getVitalsign() {
        return vitalSign;
    }

    public void setVitalsign(String vitalSign) {
        this.vitalSign = vitalSign;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    
    public String getSymptoms() {
        return symptom;
    }

    public void setSymptoms(String symptom) {
        this.symptom = symptom;
    }
    
      public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
      public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
    
}

