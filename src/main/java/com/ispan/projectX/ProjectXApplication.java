package com.ispan.projectX;

import com.ispan.projectX.dao.EmployeeRepository;
import com.ispan.projectX.entity.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ProjectXApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectXApplication.class, args);
	}



	@Bean
	public CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository){
		return runner -> {
			findAllEmployee(employeeRepository);

		};
	}

	private void findAllEmployee(EmployeeRepository employeeRepository) {
		List<Employee> lis = employeeRepository.findAll();
		for(Employee li : lis){
			System.out.println(li.toString());
		}
	}



}
