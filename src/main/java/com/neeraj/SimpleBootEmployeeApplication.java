package com.neeraj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:custom.properties")
public class SimpleBootEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleBootEmployeeApplication.class, args);
	}

}
