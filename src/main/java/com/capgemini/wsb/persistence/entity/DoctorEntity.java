package com.capgemini.wsb.persistence.entity;

import com.capgemini.wsb.persistence.enums.Specialization;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DOCTOR")
public class DoctorEntity {

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

	@Column(name = "doctorNumber", nullable = false)
	private String doctorNumber;

	@Column(name = "specialization", nullable = false)
	@Enumerated(EnumType.STRING)
	private Specialization specialization;

	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<VisitEntity> visits;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
	@JoinTable(name = "DOCTOR_ADDRESS_MAPPING", joinColumns = @JoinColumn(name = "DOCTOR_ID"), inverseJoinColumns = @JoinColumn(name = "ADDRESS_ID"))
	private List<AddressEntity> addresses;

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
	public List<VisitEntity> getVisits() {	return visits;	}
	public List<AddressEntity> getAddresses() {	return addresses;	}

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
	public void setVisits(List<VisitEntity> visits) {	this.visits = visits;}
	public void setAddresses(List<AddressEntity> addresses) {	this.addresses = addresses;	}

}
