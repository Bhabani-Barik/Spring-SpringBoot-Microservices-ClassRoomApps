package com.kanha.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "JPA_CUSTOMER_DATE_TIME")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Customer {
	
	@SequenceGenerator(name = "gen1", sequenceName = "CNO_SEQ", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	@Id
	private Integer cno;

	@Column(length = 30)
	@NonNull
	private String cname;

	@Column(length = 30)
	@NonNull
	private String cadd;
	@NonNull
	private Double billamt;
	@NonNull
	private LocalDate dob;
	@NonNull
	private LocalTime tob;
	@NonNull
	private LocalDateTime doj;

}
