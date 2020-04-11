package com.yasmin.spring.microservices.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.yasmin.spring.microservices.projects.model.Range;

@SpringBootApplication
@EnableConfigurationProperties(Range.class)
public class SpringCloudConfigViaPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigViaPropertiesApplication.class, args);
	}

}



// http://localhost:8085/range

