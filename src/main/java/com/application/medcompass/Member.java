package com.application.medcompass;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member {

	@Id
	private String id = UUID.randomUUID().toString();
	@Column(name = "first_name")
	
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "ssn")
	@JsonProperty(value = "ssn")
	private int socialSecurityNumber;
	@Column(name = "medicaid_id")
	private String medicaidId;
	private int age;
	private Date dod;

	public Member() {
	}

	public Member(String firstName, String lastName, Date dob, int socialSecurityNumber, String medicaidId, Date dod) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.socialSecurityNumber = socialSecurityNumber;
		this.medicaidId = medicaidId;
		this.dod = dod;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecuritynumber(int socialSecuritynumber) {
		this.socialSecurityNumber = socialSecuritynumber;
	}

	public String getMedicaidId() {
		return medicaidId;
	}

	public void setMedicaidId(String medicaidId) {
		this.medicaidId = medicaidId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDod() {
		return dod;
	}

	public void setDod(Date dod) {
		this.dod = dod;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, dob, dod, firstName, id, lastName, medicaidId, socialSecurityNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return age == other.age && Objects.equals(dob, other.dob) && Objects.equals(dod, other.dod)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(medicaidId, other.medicaidId)
				&& socialSecurityNumber == other.socialSecurityNumber;
	}

	@Override
	public String toString() {

System.out.println("for git practise");
		return "Member [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", socialSecurityNumber=" + socialSecurityNumber + ", medicaidId=" + medicaidId + ", age=" + age
				+ ", dod=" + dod + "]";
	}

}
