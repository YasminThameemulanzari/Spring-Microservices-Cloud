package com.yasmin.springboot.projectsrestful.webservices.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yasmin.springboot.projectsrestful.webservices.HelloWorldBean;

//Controller
@RestController
public class HelloWorldController
{

	//GET
	//URI - /hello-world
	//method - "Hello World"
	
	//@RequestMapping("/hello-world")
	//@RequestMapping(method=RequestMethod.GET,path="/hello")
	@GetMapping(path="/hello-world")
	public String hello()
	{
		return "Hello World";
	}
	
	
	@GetMapping(path="/hello-world-bean")
	
	public HelloWorldBean hello1()
	{
		return new HelloWorldBean("Hello world Bean");
	}
	
//GetMapping using path variable
	@GetMapping(path="/hello-world/path-variable/{name}")
	
	public HelloWorldBean hello2(@PathVariable String name)
	{
		return new HelloWorldBean(name);
	}
	
}

