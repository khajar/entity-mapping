package com.normalization.springdatjpamapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.normalization.springdatjpamapping.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
