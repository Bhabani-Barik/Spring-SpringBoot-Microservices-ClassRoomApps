package com.kanha.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "jpa_doctor_info")
@Data
public class DoctorEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "doctor_id")
	private Integer doctorID;
	
	@Column(name = "doctor_name", length = 25)
	private String doctorName;
	
	@Column(name = "specialization", length = 20)
	private String specialization;

	@Column(name = "income")
	private Double income;
	
}