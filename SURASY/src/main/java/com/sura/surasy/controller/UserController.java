package com.sura.surasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sura.surasy.model.User;
import com.sura.surasy.repository.UserRepository;

@RestController // Defines that this class is a spring bean
@RequestMapping("/surasy")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/consultarUsers")
	public List<User> getAllUser(){
		return userRepository.findAll();
	}
	
	@PostMapping("/insertarUsers")
	public List<User> saveListUser(@RequestBody List<User> user) {
		return userRepository.saveAll(user);
	}

}
