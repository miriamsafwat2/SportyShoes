package com.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sportyshoes.entity.User;
import com.sportyshoes.service.UserService;

@Controller
public class UsersController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public String loginUser(Model model) {
		List<User> users = userService.getAllUsers();
		model.addAttribute("users",users);
		return "users";
	}
}

