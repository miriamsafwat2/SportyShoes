package com.sportyshoes.database;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sportyshoes.entity.Product;

public interface ProductRepository  extends CrudRepository<Product, Integer>{
	public List<Product> findByName(String name);
	public List<Product> findByCategory(String category);
	//public void setCategory(int id, String category);
}
