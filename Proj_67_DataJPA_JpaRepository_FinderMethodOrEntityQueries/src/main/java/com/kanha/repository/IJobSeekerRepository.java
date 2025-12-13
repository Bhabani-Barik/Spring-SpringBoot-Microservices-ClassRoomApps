package com.kanha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kanha.entity.JobSeekerEntity;

@Repository
public interface IJobSeekerRepository extends JpaRepository<JobSeekerEntity, Integer> {

	public List<JobSeekerEntity> findByJobseekerNameEquals(String name);

	public List<JobSeekerEntity> findByJobseekerNameIs(String name);

	public List<JobSeekerEntity> getByJobseekerNameIs(String name);

	public List<JobSeekerEntity> readByJobseekerNameIs(String name);

	public List<JobSeekerEntity> findByPercentageBetween(double start, double end);

	public List<JobSeekerEntity> findByJobseekerNameStartingWith(String nameInitialChars);

	public List<JobSeekerEntity> findByJobseekerNameEndingWithIgnoreCase(String nameLastChars);

	public List<JobSeekerEntity> findByJobseekerNameContainingIgnoreCase(String chars);

	public List<JobSeekerEntity> findByJobseekerNameLikeIgnoreCase(String pattern);

	public List<JobSeekerEntity> findByQualificationIn(List<String> qualifications);

	public List<JobSeekerEntity> readByMobileNumberIsNull();

	public List<JobSeekerEntity> findByQualificationInOrderByQualificationAsc(List<String> qualifications);

}
