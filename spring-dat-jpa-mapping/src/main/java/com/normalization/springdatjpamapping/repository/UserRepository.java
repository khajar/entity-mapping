package com.normalization.springdatjpamapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.normalization.springdatjpamapping.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
