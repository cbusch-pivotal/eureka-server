package io.pivotal.mastercard.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * The main entry point for the Spring Boot application
 * 
 * @author Brian Jimerson
 *
 */
@EnableAutoConfiguration
@EnableEurekaServer
public class EurekaServerApplication {
	
	/**
	 * The main entry point method.
	 * @param args Any command line arguments passed.
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
