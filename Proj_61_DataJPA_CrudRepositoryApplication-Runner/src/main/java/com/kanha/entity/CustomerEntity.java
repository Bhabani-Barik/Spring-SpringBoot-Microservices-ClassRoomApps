package com.kanha.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name = "jpa_customer_info")
@Data
public class CustomerEntity {
	
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "customer_id_sequence", initialValue=100, allocationSize=1)
	@GeneratedValue(generator = "gen1" ,strategy = GenerationType.SEQUENCE)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE) // This creates the sequence with the name <table_name>_seq and generated the ID values as 1, 2, 52, 102, 152 and etc.
									// It start with 1 and increment by 50
	@Column(name = "customer_id")
	private Integer customerID;
	
	@Column(name = "customer_name", length = 25)
	private String customerName;
	
	@Column(name = "customer_address", length = 20)
	private String customerAddress;

	@Column(name = "bill_amount")
	private Double billAmount;
	
	@Transient
	@Column(name = "customer_payment_method")
	private String paymentMethod;
	
}
