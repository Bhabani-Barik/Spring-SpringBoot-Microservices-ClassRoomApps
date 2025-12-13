package com.kanha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanha.entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

}