package com.example.apiserver.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apiserver.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByDeviceid(String deviceid);    
}