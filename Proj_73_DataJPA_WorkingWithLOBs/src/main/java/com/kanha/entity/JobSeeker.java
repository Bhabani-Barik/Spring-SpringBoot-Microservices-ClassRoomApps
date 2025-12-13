package com.kanha.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="JPA_LOB_JOBSEEKER")
public class JobSeeker {
	@Id
	@SequenceGenerator(name = "gen1",sequenceName = "JSID_SEQ",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
   private  Integer jsid;
	@Column(length = 30)
   private  String jsname;
	@Column(length = 30)
   private  String  jsaddrs;
	@Lob
   private   byte[]  photo;
	@Lob
   private  char[]   resume;
	private  Boolean  maritalStatus;
	
}