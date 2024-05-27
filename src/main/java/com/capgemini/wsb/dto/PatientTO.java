package com.capgemini.wsb.dto;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class PatientTO implements Serializable {

    private Long id;

    private String firstName;

    private String lastName;

    private String telephoneNumber;

    private String email;

    private String patientNumber;

    private LocalDate dateOfBirth;

    private boolean firtsVisit;

    private List<AddressTO> addresses;

    private List<VisitTO> visits;


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
    public String getPatientNumber() {
        return patientNumber;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public boolean isFirtsVisit() {
        return firtsVisit;
    }
    public List<AddressTO> getAddresses() {
        return addresses;
    }
    public List<VisitTO> getVisits() {
        return visits;
    }

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
    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setFirtsVisit(boolean firtsVisit) {
    this.firtsVisit = firtsVisit;
    }
    public void setAddresses(List<AddressTO> addresses) {
        this.addresses = addresses;
    }
    public void setVisits(List<VisitTO> visits) {
        this.visits = visits;
    }
}
