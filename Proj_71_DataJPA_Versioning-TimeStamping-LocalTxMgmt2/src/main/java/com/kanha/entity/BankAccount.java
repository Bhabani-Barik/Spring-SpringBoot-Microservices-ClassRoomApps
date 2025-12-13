package com.kanha.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;

@Data
@Entity
@Table(name="JPA_METADATA_ACCOUNT")
public class BankAccount {
	
	 // Data Properties
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "ACNO_SEQ",initialValue = 10000000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Long acno;
	@Column(length = 30)
	private  String hodlername;
	private   Double balance;
	
	//MetaData Properties
	@Column(name="UPDATE_COUNT")
	@Version
	private  Long updateCount;
	
	@Column(name="CREATION_TIME",insertable = true,updatable = false)
	@CreationTimestamp
	private  LocalDateTime  creationTme;
	
	
	@Column(name="UPDATION_TIME",insertable = false,updatable = true)
	@UpdateTimestamp
	private  LocalDateTime  updationTme;
	
	@Column(length = 30)
	private  String  createdBy;
	
	@Column(length = 30)
	private  String updatedDBy;
	
	@Column(length = 30)
	private  String active_SW="active";
	
}