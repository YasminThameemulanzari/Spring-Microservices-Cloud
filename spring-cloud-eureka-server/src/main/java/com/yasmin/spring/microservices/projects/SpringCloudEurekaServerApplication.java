package com.yasmin.spring.microservices.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer                    //To enable the application as Eureka server

public class SpringCloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaServerApplication.class, args);
	}

}


//Eureka server will run in http://localhost:8761/ by default. If you wanted to change the port, then use "server.port=portno" in aplication.propertties. 


//Eureka server providers UI to show the connected clients


//Eureka server is a discovery server

