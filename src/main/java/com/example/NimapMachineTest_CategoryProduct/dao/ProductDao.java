package com.example.NimapMachineTest_CategoryProduct.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.example.NimapMachineTest_CategoryProduct.entity.Product;
import com.example.NimapMachineTest_CategoryProduct.repository.ProductRepository;


@Repository
public class ProductDao {
	@Autowired
	private ProductRepository repository;
	
	public Page<Product> fetchAllProducts(Pageable pageable){
		return repository.findAll(pageable);
	}
	
	public Product createProduct(Product product) {
		return repository.save(product);
	}
	
	
	public Product getProductById(int id) {
		 Optional<Product> optional = repository.findById(id);
		 
		 if(optional.isPresent()) {
			 return optional.get();
		 }
		 return null;
	}
	
	public Product updateProduct(Product product) {
		return repository.save(product);
	}
	
	public void deleteProduct(int id) {
		repository.deleteById(id);
	}
}

