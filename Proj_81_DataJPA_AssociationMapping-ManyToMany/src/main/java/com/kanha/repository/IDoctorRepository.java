package com.kanha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanha.entity.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor, Integer> {

}
