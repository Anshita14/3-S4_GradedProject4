package com.greatlearning.employeemanagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class EmployeemanagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagmentApplication.class, args);
	}

}
