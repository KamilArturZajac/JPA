package com.capgemini.wsb.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ADDRESS")
public class AddressEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "city", nullable = false)
	private String city;

	@Column(name = "addressLine1", nullable = false)
	private String addressLine1;

	@Column(name = "addressLine2")
	private String addressLine2;

	@Column(name = "postalCode", nullable = false)
	private String postalCode;

	@ManyToMany(mappedBy = "addresses")
	private List<DoctorEntity> doctors;

	@ManyToMany(mappedBy = "addresses")
	private List<PatientEntity> patients;

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
	public List<DoctorEntity> getDoctors() {return doctors;	}
	public List<PatientEntity> getPatients() {	return patients;}

	public void setId(Long id) {
		this.id = id;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public void setDoctors(List<DoctorEntity> doctors) {this.doctors = doctors;	}
	public void setPatients(List<PatientEntity> patients) {	this.patients = patients;}

}
