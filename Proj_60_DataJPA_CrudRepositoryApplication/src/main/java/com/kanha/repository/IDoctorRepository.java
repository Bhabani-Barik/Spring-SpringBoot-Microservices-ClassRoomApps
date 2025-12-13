package com.kanha.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kanha.entity.DoctorEntity;

@Repository
public interface IDoctorRepository  extends CrudRepository<DoctorEntity, Integer>{

}
