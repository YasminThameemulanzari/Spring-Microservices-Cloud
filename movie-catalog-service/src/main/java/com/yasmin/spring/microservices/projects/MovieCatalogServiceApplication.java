package com.yasmin.spring.microservices.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrixDashboard
@RibbonClient(name="movie-catalog-service")
public class MovieCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}

}

//=============================================
//                             Notes:
//=============================================


// http://localhost:8082/catalog/1     - micro service
//http://localhost:8082/hystrix        - hystrix dashboard
//Hystrix Stream: http://localhost:8082/actuator/hystrix.stram - graph



//Ribbon load Balancing 
//Application.properties setup

//	movie-catalog-service.ribbon.listOfServers=http://localhost:9001,http://localhost:9002

// Start the application with diff port via "Run configurations" - Use -DServer.port=9001" in Arguments. 

//Now we have 3 ports

	//http://localhost:8082/catalog/1
	//http://localhost:9001/catalog/1
	//http://localhost:9001/catalog/1


