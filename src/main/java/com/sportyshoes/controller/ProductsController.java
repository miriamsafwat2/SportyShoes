package com.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sportyshoes.entity.Product;
import com.sportyshoes.service.ProductService;

@Controller
public class ProductsController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public String getProducts(Model model) {
		List<Product> prodcuts = productService.getAllProducts();
		model.addAttribute("products",prodcuts);
		return "products";
	}
}
