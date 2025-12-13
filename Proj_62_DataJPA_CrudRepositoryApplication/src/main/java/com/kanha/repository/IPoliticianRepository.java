package com.kanha.repository;

import org.springframework.data.repository.CrudRepository;

import com.kanha.entity.Politician;

public interface IPoliticianRepository extends CrudRepository<Politician, Integer> {

}
