package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAssignmentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext config= SpringApplication.run(SpringAssignmentApplication.class, args);
		Train t=config.getBean(Train.class);
		t.trainInfo();
	
	}

}

