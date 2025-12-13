package com.kanha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanha.entity.Politician;

public interface IPoliticianRepository extends JpaRepository<Politician, Integer> {

}

