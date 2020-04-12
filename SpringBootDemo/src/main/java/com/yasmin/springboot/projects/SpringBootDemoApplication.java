package com.yasmin.springboot.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		
		Alien obj = context.getBean(Alien.class);   //getbean - Spring creates the object for the given class if its mentioned as @Component
		
		obj.code();
	}

}
