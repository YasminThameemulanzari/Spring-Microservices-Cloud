Just Loved it :-) Auto config.. just concentrate only on core business. 



Monolithic architectures: challenges
=====================================

As application grows and code base grows, it overloads and reduced developer productivity.
As everything is packaged in one EAR/WAR, we cannot change technology stack, refactoring code base is difficult.
If any single function fails, the entire application goes down.
If a particular function consumes more memory, entire application feels the pain.
Scaling such a monolithic application can only be accomplished by deploying the same EAR/WAR packages in more servers — also known as horizontal scaling. Each copy of the application in various servers will utilize the same amount of underlying resources, which is often not an efficient way to design.

Microservices: advantages
=========================

Decentralized, Independent, Do one thing well, Polyglot, Black box.
Agility, scalability, availability, reusability.
Improves fault isolation, Eliminates long-term commitment to a single technology stack, Code for different services can be written in different languages
Makes it easier for a new developer to understand the functionality of a service, enables continuous delivery.

Microservices: Challenges
========================

Just because something is all the rage around the industry, doesn’t mean it has no challenges. Here’s a list of some potential pain areas we realized.
•Initial developing distributed systems can be complex.
•Testing a microservices-based application can be tricky as compared to monolithic approach.
 Deploying microservices can be complex initially.

List of Spring cloud Netflix Server:
====================================

	https://spring.io/projects/spring-cloud-netflix
	
	https://medium.com/@madhupathy/simplified-microservices-building-with-spring-cloud-netflix-oss-eureka-zuul-hystrix-ribbon-2faa9046d054



List of technologies involved:
=============================

Spring Config Server 			→ Babysitter for configurations of all APIs
Spring Cloud Netflix Eureka 		→ Directory for all APIs  - Naming Server - Service Registration and discovery
Spring Cloud Netflix Ribbon 		→ Load balancing - network cops for all communications  
Spring Cloud Netflix Hystrix 		→ Re-router/circuit breaker
Spring Cloud Netflix Hystrix Dashboard 	→ cctv cameras for all rest calls
Spring Cloud Netflix Zuul 		→ Gatekeeper for APIs
Spring Cloud Netflix Feign 		→ Client calls another REST Service (FeignClient and RestTemplate - are both ways to consume RESTful services) 




Zuul :
======

Zuul is our gatekeeper to the outside world, not allowing any unauthorized external requests pass through. Zuul also provides a well known entry point to the microservices in the system landscape. Using dynamically allocated ports is convenient to avoid port conflicts and to minimize administration but it makes it of course harder for any given service consumer.

Ribbon — Load Balancing:
========================
Zuul uses Ribbon to lookup available services and routes the external request to an appropriate service instance.

Monitoring Server:
==================
There are multiple components to monitoring server. Hystrix, Turbine and Hystrix-Dashboard.

Sleuth - Generates trace ID:
========

 Sleuth is a tool from Spring cloud family. It is used to generate the trace id, span id and add these information to the service calls in the headers and MDC, so that It can be used by tools like Zipkin and ELK etc.


Annotations:
============

@EnableEurekaServer 	- spring-cloud-starter-eureka-server
@EnableDiscoveryClient	- spring-cloud-starter-eureka 
@EnableZuulProxy	- spring-cloud-starter-zuul
@EnableTurbine		- spring-cloud-starter-turbine
@EnableHystrixDashboard	- spring-cloud-starter-hystrix-dashboard 
@EnableHystrix 		- spring-cloud-starter-hystrix   
@HystrixCommand		- spring-cloud-starter-hystrix - @HystrixCommand(fallbackMethod = “fallbackMethodName”)
@EnableConfigServer  	- spring-cloud-starter-config-server
@EnableConfigClient  	- spring-cloud-starter-config  
@EnableCircuitBreaker	- spring-cloud-starter-hystrix
@EnableFeignClients	- spring-cloud-starter-feign
@FeignClient		- spring-cloud-starter-feign  - @FeignClient(name ="",url="whr you want to talk to") 
@RibbonClient		- spring-cloud-starter-netflix-ribbon - @RibbonClient(name="")
Zipkin - No Annotation	- spring-cloud-starter-zipkin  - old(spring-cloud-sleuth-zipkin)
Rabbit MQ No Annotation	- spring-rabbit   (To connect with Rabbit MQ) - old (spring-cloud-starter-bus-amqp)
@EnableSwagger2		- springfox-swagger2, springfox-swagger-ui



How to add more APIs:
=====================

Step 1: Link to configuration service
Step 2: Link to registry service
Step 3: Link to api gateway
Step 4: Estimate bandwidth and number of containers required for load balancing and update ribbon config
Step 5: Link to hystrix service for circuit breaker.





Spring Cloud Microservice Configuration:
========================================


Application.properties:
======================


spring.application.name=config-server
server.port=8888
spring.cloud.config.server.git.uri=https://github.com/briansjavablog/micro-services-spring-cloud-config  - # URI of GIT repo containing properties
spring.cloud.config.server.git.searchPaths: configuration  - # path to properties from root of repo 
logging.level.org.springframework.web=INFO


(or)


spring.application.name=bank-account-service
server.port=8080
spring.config.cloud.uri=htp://localhost:8888
spring.cloud.config.profile=uat
management.endpoints.web.exposure.include=*


Annotations:
============

@ConfigurationProperties(prefix="bank-account-service")
@EnableConfigServer





1. Eureka - Naming Server, Service registration and discover
2. Ribbon - Load balancer between micro services (Talk to Eureka naming serers to find the available port to load balance)
3. Zuul   - API gateway (Execute Micro service via gateway), Logging filters
4. Feign  - Calls REST webservices/micro services
5. Hystrix - Circuit breaker (Fault tolarance) and Provide dashboard
6. Zipkin - Distributed Tracing Server by Netflix 
7. Sleuth  - Generates Trace ID for each service calls. These trace ID's are used by Zipkin tracing server
8. Rabbit MQ -  MQ
9. Swagger - Documentation - document RESTful APIs (Swagger UI - shows the list of REst API's)
10.Hateoas	


You tube Channes:
=================

Telusko 	: https://www.youtube.com/user/javaboynavin
Java Brains 	: https://www.youtube.com/user/koushks/playlists
Tech Primers 	: https://www.youtube.com/channel/UCB12jjYsYv-eipCvBDcMbXw/playlists?view=50&sort=dd&shelf_id=10



1) Spring Boot Microservices Level 1: Communication and Discovery
2) Spring Boot Microservices Level 2: Fault Tolerance and Resilience
3) Spring Boot Microservices Level 3: Microservice configuration
 
	https://www.youtube.com/user/koushks/playlists?view=50&sort=dd&shelf_id=12


Spring Framework:
=================

https://www.youtube.com/user/koushks/playlists?view=50&sort=dd&shelf_id=2
