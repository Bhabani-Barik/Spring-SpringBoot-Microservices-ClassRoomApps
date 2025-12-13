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
@Table(name="JPA_MTM_PATIENT")
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Patient {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "PAT_ID",initialValue = 1,allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen1")
	private  Integer patid;
	@NonNull
	@Column(length = 30)
	private   String  patName;
	@NonNull
	@Column(length = 30)
	private  String  patAddrs;
	
	@ManyToMany(targetEntity = Doctor.class,cascade = CascadeType.ALL,mappedBy = "patients",fetch = FetchType.EAGER)
	private  Set<Doctor>  doctors=new HashSet<Doctor>();

	@Override
	public String toString() {
		return "Patient [patId=" + patid + ", patName=" + patName + ", patAddrs=" + patAddrs + "]";
	}
	
	

}

