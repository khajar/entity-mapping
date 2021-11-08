package com.normalization.springdatjpamapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.normalization.springdatjpamapping.entity.Product;



public interface ProductRepository extends JpaRepository<Product,Integer> {

}
