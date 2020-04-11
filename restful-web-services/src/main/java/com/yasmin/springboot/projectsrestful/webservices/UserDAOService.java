package com.yasmin.springboot.projectsrestful.webservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDAOService 
{

	private static List<User> users = new ArrayList<>();
	
	static
	{
		users.add(new User(1,"Yas"));
		users.add(new User(2,"Safa"));
		users.add(new User(3,"Sana"));
		users.add(new User(4,"Hana"));
		users.add(new User(5,"Anu"));
		
	}
	
	
	public List<User> findAll()
	{
		return users;
	}
	
	public User Save(User user)
	{
		users.add(user);
		return user;
	}
	
	
	public User FindOne(int id) 
	{
		for(User user:users)
		{
			if (user.getId() == id)
			{
				return user;
			}
		}
		return null;
	}
}
