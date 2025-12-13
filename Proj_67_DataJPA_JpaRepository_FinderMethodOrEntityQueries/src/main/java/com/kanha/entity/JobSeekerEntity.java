package com.kanha.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "jpa_job_seeker_info")
@Data
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
public class JobSeekerEntity {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "jsid_eq", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "jobseeker_id")
	private Integer jobseekerID;

	@Column(name = "jobseeker_name", length = 20)
	@NonNull
	private String jobseekerName;

	@Column(name = "joobseeker_qualification", length = 20)
	@NonNull
	private String qualification;

	@Column(name = "jobseeker_percentage")
	@NonNull
	private Double percentage;

	// @Transient
	@Column(name = "joobseeker_contact_info")
	@NonNull
	private Long jobseekerMobileNumber;

	public JobSeekerEntity() {
		System.out.println(
				"JobSeekerEntity:: 0-param constructor :: " + this.getClass() + this.getClass().getSuperclass());
	}

}
