package com.yasmin.springboot.projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component     //Spring framework is responsible for creating object
public class Alien {
	
	@Autowired  //Auto creates the object
	Laptop lap;
	
	
	
	public void code()
	{
	 lap.compile();
	}

}
