package com.kanha.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="JPA_TX_ACCOUNT")
public class BankAccount {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "ACNO_SEQ",initialValue = 10000000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Long acno;
	@Column(length = 30)
	private  String hodlername;
	private   Double balance;

}