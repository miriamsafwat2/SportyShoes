package com.sportyshoes.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.database.ProductRepository;
import com.sportyshoes.entity.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	public List<Product> getAllProducts(){
		return (List<Product>) this.productRepo.findAll();
	}
	
	public List<Product> findByName(String name){
		return this.productRepo.findByName(name);
	}
	
	public List<Product> findByCategory(String category){
		return this.productRepo.findByCategory(category);
	}
	
	public void updateProduct(Product product) {
		if(!this.productRepo.existsById(product.getId()))
			throw new EntityNotFoundException("Cannot update as product with id " + product.getId() + " doesn't exist");
		
		this.productRepo.save(product);
	}
	
	public void addProduct(Product product) {
		this.productRepo.save(product);
	}
}
