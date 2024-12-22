package com.example.NimapMachineTest_CategoryProduct.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.example.NimapMachineTest_CategoryProduct.entity.Category;
import com.example.NimapMachineTest_CategoryProduct.repository.CategoryRepository;



@Repository
public class CategoryDao {
	
	@Autowired
	private CategoryRepository repository;
	
	public Page<Category> fetchAllCategory(Pageable pageable){
		return repository.findAll(pageable);
	}
	

	public Category createCategory(Category category) {
		return repository.save(category);		
	}
	

	public Category getCategoryById(int id) {
		 Optional<Category> optional = repository.findById(id);
		 
		 if(optional.isPresent()) {
			 return optional.get();
		 }
		 return null;
	}
	
	
	public Category updateCategory(Category category) {
		return repository.save(category);
	}
	
	public void deleteCategory(int id) {
		repository.deleteById(id);
	}
}
