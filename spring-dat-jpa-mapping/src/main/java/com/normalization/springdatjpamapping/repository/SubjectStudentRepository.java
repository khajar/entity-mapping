package com.normalization.springdatjpamapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.normalization.springdatjpamapping.entity.CompositeKey;
import com.normalization.springdatjpamapping.entity.SubjectStudent;

@Repository
public interface SubjectStudentRepository extends JpaRepository<SubjectStudent,CompositeKey> {

}
