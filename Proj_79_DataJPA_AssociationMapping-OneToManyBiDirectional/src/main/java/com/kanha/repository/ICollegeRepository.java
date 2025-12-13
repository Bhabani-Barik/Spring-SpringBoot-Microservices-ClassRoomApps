package com.kanha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanha.entity.College;

public interface ICollegeRepository extends JpaRepository<College, Integer> {

}
