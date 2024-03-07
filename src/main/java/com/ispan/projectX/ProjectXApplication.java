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




	@Bean
	public CommandLineRunner commandLineRunner(ComplaintRepository complaintRepository,EmployeeRepository employeeRepository){
		return runner -> {
			findComplaintByEmployee(employeeRepository);
        };
	}



	//找出該employee所處理的所有Complaint(By Employee物件)，使用employeeRepository
	private void findComplaintByEmployee(EmployeeRepository employeeRepository){
		Employee emp = employeeRepository.findByEmployeeId(2);
		List<Complaint> lis = employeeRepository.findComplaintByEmployee(emp);
		for (Complaint li : lis) {
			System.out.println(li.toString());
		}
	}

	//找出該employee所處理的所有Complaint(By EmployeeId)，使用complaintRepository
	private  void findComplaintByEmployeeId(ComplaintRepository complaintRepository){
		List<Complaint> lis = complaintRepository.findByEmployeeEmployeeId(2);
		for(Complaint li:lis){
			System.out.println(li.toString());
		}
	}

	//在Complaint加入EmployeeId(讓他們有關係)
	private void setEmployeeIdInComplaint(ComplaintRepository complaintRepository,EmployeeRepository employeeRepository){
		Employee emp = employeeRepository.findByEmployeeId(1);
		Complaint com = complaintRepository.findByComplaintId(1);
		com.setEmployee(emp);
		complaintRepository.save(com);
	}
	private void findAllEmployee(EmployeeRepository employeeRepository) {
		List<Employee> lis = employeeRepository.findAll();
		for(Employee li : lis){
			System.out.println(li.toString());
		}
	}
}




