package com.capgemini.wsb.dto;

import com.capgemini.wsb.persistence.entity.DoctorEntity;
import com.capgemini.wsb.persistence.entity.PatientEntity;

import java.io.Serializable;
import java.util.List;

public class AddressTO implements Serializable
{
    private Long id;

    private String city;

    private String addressLine1;

    private String addressLine2;

    private String postalCode;

    private List<DoctorTO> doctors;

    private List<PatientTO> patients;


    public Long getId() {
        return id;
    }
    public String getCity() {
        return city;
    }
    public String getAddressLine1() {
        return addressLine1;
    }
    public String getAddressLine2() {
        return addressLine2;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public List<DoctorTO> getDoctors() {return doctors;	}
    public List<PatientTO> getPatients() {	return patients;}

    public void setId(Long id) {
        this.id = id;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    public void setAddressLine2(String addressLine2) {this.addressLine2 = addressLine2;}
    public void setPostalCode(String postalCode) {this.postalCode = postalCode;}
    public void setDoctors(List<DoctorTO> doctors) {this.doctors = doctors;	}
    public void setPatients(List<PatientTO> patients) {	this.patients = patients;}
}
