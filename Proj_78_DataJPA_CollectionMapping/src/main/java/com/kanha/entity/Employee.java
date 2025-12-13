package com.kanha.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Table(name="JPA_COLLECTION_EMPLOYEE")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Employee {
	@SequenceGenerator(name="gen1",sequenceName = "EMPNO_SEQ",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	@Id
	private  Integer empno;
	
	@Column(length = 20)
	@NonNull
	private  String  ename;
	
	@Column(length = 20)
	@NonNull
	private  String eaddrs;
	
	@ElementCollection
	@CollectionTable(name="FRIENDS_INFO_TAB",joinColumns = @JoinColumn(name="EMP_ID",referencedColumnName = "EMPNO"))
	@Column(name="FRIEND_NAME",length = 20)
	@NonNull
	private  List<String> friends;
	
	@ElementCollection
	@CollectionTable(name="PHONES_INFO_TAB",joinColumns = @JoinColumn(name="EMP_ID",referencedColumnName = "EMPNO"))
	@Column(name="CONTACT_NUMBER")
	@NonNull
	private  Set<Long> phones;
	
	@ElementCollection
	@CollectionTable(name="IDDETAILS_INFO_TAB",joinColumns = @JoinColumn(name="EMP_ID",referencedColumnName = "EMPNO"))
	@Column(name="ID_NUMBER")
	@MapKeyColumn(name = "ID_NAME",length = 20)
	@NonNull
	private  Map<String,String> idDetails;
	

}
