package com.example.NimapMachineTest_CategoryProduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NimapMachineTest_CategoryProduct.entity.Category;



@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
