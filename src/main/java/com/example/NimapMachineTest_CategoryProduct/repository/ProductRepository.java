package com.example.NimapMachineTest_CategoryProduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NimapMachineTest_CategoryProduct.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
