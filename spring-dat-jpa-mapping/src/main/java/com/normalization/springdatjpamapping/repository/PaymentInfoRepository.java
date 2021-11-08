package com.normalization.springdatjpamapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.normalization.springdatjpamapping.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String>{

}
