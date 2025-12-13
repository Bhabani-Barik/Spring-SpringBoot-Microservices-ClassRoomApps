package com.kanha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kanha.entity.Politician;

@Repository
public interface IPoliticianRepository extends JpaRepository<Politician, Integer>{
}
