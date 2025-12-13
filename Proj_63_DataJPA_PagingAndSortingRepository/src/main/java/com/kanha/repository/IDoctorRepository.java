package com.kanha.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.kanha.entity.DoctorEntity;

@Repository
public interface IDoctorRepository extends PagingAndSortingRepository<DoctorEntity, Integer>{

}
