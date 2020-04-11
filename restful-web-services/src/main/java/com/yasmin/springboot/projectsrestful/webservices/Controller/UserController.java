package com.yasmin.springboot.projectsrestful.webservices.Controller;

import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.apache.tomcat.util.file.ConfigurationSource.Resource;
import org.hibernate.engine.jdbc.connections.internal.UserSuppliedConnectionProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.yasmin.springboot.projectsrestful.webservices.User;
import com.yasmin.springboot.projectsrestful.webservices.UserDAOService;
import com.yasmin.springboot.projectsrestful.webservices.exception.UserNotFoundException;

@RestController
public class UserController {

	@Autowired
	private UserDAOService service;
	
//Fetch all users
	
	@GetMapping("/users")
	public List<User> retirieveAllUsers()
	{
		return service.findAll();
	}

// Fetch the user by id
	
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) throws UserNotFoundException
	{
		User user =  service.FindOne(id);
		if (user == null)
		{
			throw new UserNotFoundException("id - :"+id);
		}

		
		return user;
		
	}
	
//Create the user 
	
	@PostMapping("/users/save")
	public User createUser( @Valid @RequestBody User user)      //@Valid validates the variable 
	{
		User savedUser =  service.Save(user);
		
		
		
		return savedUser;
	}
	
 
	
	
 
}
