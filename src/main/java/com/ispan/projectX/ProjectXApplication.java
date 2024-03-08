package com.ispan.projectX;

import com.ispan.projectX.dao.ComplaintRepository;
import com.ispan.projectX.dao.EmployeeRepository;
import com.ispan.projectX.entity.Complaint;
import com.ispan.projectX.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class ProjectXApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectXApplication.class, args);
	}


	private void findAllEmployee(EmployeeRepository employeeRepository) {
		List<Employee> lis = employeeRepository.findAll();
		for(Employee li : lis){
			System.out.println(li.toString());
		}
	}
}




