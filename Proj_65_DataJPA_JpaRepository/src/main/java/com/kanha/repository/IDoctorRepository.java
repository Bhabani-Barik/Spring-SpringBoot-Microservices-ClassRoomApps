package com.kanha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kanha.entity.DoctorEntity;

@Repository
public interface IDoctorRepository  extends JpaRepository<DoctorEntity, Integer>{
	
}
