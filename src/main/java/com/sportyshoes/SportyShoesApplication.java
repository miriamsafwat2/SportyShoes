package com.sportyshoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sportyshoes.service.ProductService;
import com.sportyshoes.service.UserService;
import com.sportyshoes.entity.Product;
import com.sportyshoes.entity.User;

@SpringBootApplication
public class SportyShoesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportyShoesApplication.class, args);
	}
	
	//@Autowired
	//private UserDatabase userDb;
	
	//@Bean
	public void initialize() {
		//System.out.println(userDb.getTemplate());
	}
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductService productService;
	
	//@Bean
	public void addProduct() {
		Product p = new Product(3,"Puma","Large");
		productService.addProduct(p);
	}
	
	@Bean
	public void updateProduct() {
		Product p = new Product(3,"Puma","xsmall");
		productService.updateProduct(p);
	}
	
	//@Bean
	public void addUser() {
		User user = new User(3,"Marc","marc @vodafone.com");
		userService.addUser(user);
	}

}
