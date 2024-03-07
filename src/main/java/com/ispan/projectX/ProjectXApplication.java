package com.ispan.projectX;

import com.ispan.projectX.dao.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectXApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectXApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository){
		return runner -> {

			employeeRepository.findAll();

		};
	}

}
