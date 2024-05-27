package com.capgemini.wsb.dto;

import com.capgemini.wsb.persistence.entity.DoctorEntity;
import com.capgemini.wsb.persistence.entity.MedicalTreatmentEntity;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import com.capgemini.wsb.persistence.enums.TreatmentType;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class MedicalTreatmentTO implements Serializable {

    private Long id;

    private String description;

    private TreatmentType type;

    private VisitEntity visit;


    public Long getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public TreatmentType getType() {
        return type;
    }
    public VisitEntity getVisit() {
        return visit;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setType(TreatmentType type) {
        this.type = type;
    }
    public void setVisit(VisitEntity visit) {
        this.visit = visit;
    }

}
