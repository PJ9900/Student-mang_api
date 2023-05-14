package com.example.dem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
