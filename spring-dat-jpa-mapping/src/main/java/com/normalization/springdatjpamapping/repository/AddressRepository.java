package com.normalization.springdatjpamapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.normalization.springdatjpamapping.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}
