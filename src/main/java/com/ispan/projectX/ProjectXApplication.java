package com.ispan.projectX;

import com.ispan.projectX.dao.ComplaintRepository;
import com.ispan.projectX.dao.EmployeeRepository;
import com.ispan.projectX.dao.SellerRepository;
import com.ispan.projectX.dao.UsersRepository;
import com.ispan.projectX.entity.Complaint;
import com.ispan.projectX.entity.Employee;
import com.ispan.projectX.entity.Seller;
import com.ispan.projectX.entity.Users;
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
	public CommandLineRunner commandLineRunner(ComplaintRepository complaintRepository){
		return runner -> {

//			List<Employee> lis = employeeRepository.findAll();
//
//			for(Employee employee : lis) {
//				System.out.println(employee);
//			}

//			List<Users> lis = usersRepository.findAll();
//
//			for(Users users : lis) {
//				System.out.println(Users);
//			}

//			List<Seller> lis = sellerRepository.findAll();
//
//			for(Seller seller : lis) {
//				System.out.println(seller);
//			}

			List<Complaint> lis = complaintRepository.findAll();

			for(Complaint complaint : lis) {
				System.out.println(complaint);
			}

		};
	}

}
