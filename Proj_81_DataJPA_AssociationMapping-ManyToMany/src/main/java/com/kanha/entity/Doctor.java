package com.kanha.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="JPA_MTM_DOCTOR")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
public class Doctor {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "DID",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private  Integer did;
	
	@Column(length = 30)
	@NonNull
	private  String  name;

	@Column(length = 30)
	@NonNull
	private   String  addrs;
	
	@Column(length = 30)
	@NonNull
	private   String speciality;
	
	@ManyToMany(targetEntity = Patient.class, cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name="JPA_MTM_DOCTORS_PATIENTS",
	                       joinColumns = @JoinColumn(name="DOCTOR_ID",referencedColumnName = "DID"), //owning side FK column
	                       inverseJoinColumns =@JoinColumn(name="PATIENT_ID",referencedColumnName = "PATID") ) //non-owning side FK column
	private  Set<Patient>  patients=new HashSet<Patient>();

	@Override
	public String toString() {
		return "Doctor [did=" + did + ", name=" + name + ", addrs=" + addrs + ", speciality=" + speciality + "]";
	}
	
	
	

}
