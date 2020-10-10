package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/* Sometimes here in the main application, it happens to not import the entities, to solve that problem
 * we should force it to import the entities, ok? Just for precaution! */
@EnableConfigurationProperties //Here it forces it to use the application.properties file
@EntityScan(basePackages = "com.example.entities") //here we point to the entity package in our file structure
@SpringBootApplication //here we mention that class as main spring boot application
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}


/* Looks like everything is running smoothly, lets go see the database... Theres no tables...*/

/* It runs ok, no errors, but database was not created... weird... i'll check it later, thanks! */