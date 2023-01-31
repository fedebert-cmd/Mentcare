package it.univr.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, name = "ID_PRESCRIPTION")
    private long idPrescription;

    private String doctor;

    private String drug;

    private String patient;

    private String dosage;

    protected Prescription() {}

    public Prescription(String doctor, String drug, String patient, String dosage) {
        this.doctor = doctor;
        this.drug = drug;
        this.patient = patient;
        this.dosage = dosage;
    }

    public long getIdPrescription() {
        return idPrescription;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}
