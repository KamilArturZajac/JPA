package com.capgemini.wsb.dto;

import com.capgemini.wsb.persistence.entity.*;
import com.capgemini.wsb.persistence.enums.Specialization;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class DoctorTO implements Serializable {

    private Long id;

    private String firstName;

    private String lastName;

    private String telephoneNumber;

    private String email;

    private String doctorNumber;

    private Specialization specialization;

    private List<VisitTO> visits;

    private List<AddressTO> addresses;


    public Long getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getTelephoneNumber() {
        return telephoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getDoctorNumber() {
        return doctorNumber;
    }
    public Specialization getSpecialization() {
        return specialization;
    }
    public List<VisitTO> getVisits() {	return visits;	}
    public List<AddressTO> getAddresses() {	return addresses;	}

    public void setId(Long id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDoctorNumber(String doctorNumber) {
        this.doctorNumber = doctorNumber;
    }
    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }
    public void setVisits(List<VisitTO> visits) {	this.visits = visits;}
    public void setAddresses(List<AddressTO> addresses) {	this.addresses = addresses;	}



}
