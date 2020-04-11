package com.yasmin.spring.microservices.projects.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yasmin.spring.microservices.projects.model.Range;

@RestController
@RequestMapping

public class RangeController
{
	@Autowired
	private Range range;
	
	@GetMapping("/range")
	private Range getRange( )
	{
		return new Range(range.getMin(),range.getMax());
	}
	
}
