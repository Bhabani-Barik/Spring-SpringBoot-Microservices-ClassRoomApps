package com.kanha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanha.entity.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Integer> {

}