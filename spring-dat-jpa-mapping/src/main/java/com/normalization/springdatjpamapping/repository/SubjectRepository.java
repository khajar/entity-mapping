package com.normalization.springdatjpamapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.normalization.springdatjpamapping.entity.Subjects;

@Repository
public interface SubjectRepository extends JpaRepository<Subjects,Integer> {

}
