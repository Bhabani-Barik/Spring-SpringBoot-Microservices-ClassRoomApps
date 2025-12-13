package com.kanha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanha.entity.JobSeeker;

public interface IJobSeekerRepository extends JpaRepository<JobSeeker, Integer> {

}
