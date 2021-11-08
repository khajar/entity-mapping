package com.normalization.springdatjpamapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.normalization.springdatjpamapping.entity.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {

}
