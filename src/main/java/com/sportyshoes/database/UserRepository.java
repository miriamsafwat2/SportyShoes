package com.sportyshoes.database;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sportyshoes.entity.User;


public interface UserRepository extends CrudRepository<User, Integer>{
	public List<User> findByName(String name);
	public List<User> findByEmail(String email);
}