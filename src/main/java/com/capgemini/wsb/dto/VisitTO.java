package com.capgemini.wsb.dto;

import com.capgemini.wsb.persistence.entity.DoctorEntity;
import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;
import com.capgemini.wsb.persistence.entity.PatientEntity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class VisitTO implements Serializable {

    private Long id;

    private String description;

    private LocalDateTime time;

    private Long patientID;

    private Long doctorID;

    private PatientTO patient;

    private DoctorTO doctor;

    private List<MedicalTreatmentTO> medicalTreatments;


    public Long getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public LocalDateTime getTime() {
        return time;
    }
    public Long getPatientID() {
        return patientID;
    }
    public Long getDoctorID() {
        return doctorID;
    }
    public List<MedicalTreatmentTO> getMedicalTreatments() {
        return medicalTreatments;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setTime(LocalDateTime time) {
        this.time = time;
    }
    public void setPatientID(Long patientID) {
        this.patientID = patientID;
    }
    public void setDoctorID(Long doctorID) {
        this.doctorID = doctorID;
    }
    public void setMedicalTreatments(List<MedicalTreatmentTO> medicalTreatments) {this.medicalTreatments = medicalTreatments;}
}
