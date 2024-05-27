package com.capgemini.wsb.persistence.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "PATIENT")
public class PatientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "firstName", nullable = false)
	private String firstName;

	@Column(name = "lastName", nullable = false)
	private String lastName;

	@Column(name = "telephoneNumber", nullable = false)
	private String telephoneNumber;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "patientNumber", nullable = false)
	private String patientNumber;

	@Column(name = "dateOfBirth", nullable = false)
	private LocalDate dateOfBirth;

	@Column(name = "firtsVisit", nullable = false)
	private Boolean firtsVisit;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
	@JoinTable(
			name = "PATIENT_ADDRESS_MAPPING",
			joinColumns = @JoinColumn(name = "PATIENT_ID"),
			inverseJoinColumns = @JoinColumn(name = "ADDRESS_ID")
	)
	private List<AddressEntity> addresses;

	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<VisitEntity> visits;

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
	public List<AddressEntity> getAddresses() {
		return addresses;
	}
	public List<VisitEntity> getVisits() {
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
	public void setAddresses(List<AddressEntity> addresses) {
		this.addresses = addresses;
	}
	public void setVisits(List<VisitEntity> visits) {
		this.visits = visits;
	}

}

