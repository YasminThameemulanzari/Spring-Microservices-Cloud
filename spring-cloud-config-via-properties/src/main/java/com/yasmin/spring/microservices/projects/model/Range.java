package com.yasmin.spring.microservices.projects.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="range")
public class Range 
{
	
	private int min;
	
	private int max;
	
	public Range() {
	
	}
	
	@Override
	public String toString() {
		return "Range [min=" + min + ", max=" + max + "]";
	}
	public Range(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	
	
}
