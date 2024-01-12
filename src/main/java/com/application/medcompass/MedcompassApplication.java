package com.application.medcompass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.application.medcompass","com.medcompass.repository"})
@EnableJpaRepositories({"com.medcompass.repository"})
public class MedcompassApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedcompassApplication.class, args);
	}

}
