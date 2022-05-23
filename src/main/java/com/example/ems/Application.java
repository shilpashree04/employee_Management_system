package com.example.ems;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@ComponentScan(basePackages = "com.example.ems")
public class Application {

	static final Logger logger = LogManager.getLogger(Application.class.getName());
	
	public static void main (String[] args) {
		logger.info("entered application");
		SpringApplication.run(Application.class, args);
				
	}
}
