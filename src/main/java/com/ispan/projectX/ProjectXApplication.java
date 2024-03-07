package com.ispan.projectX;

import com.ispan.projectX.dao.*;
import com.ispan.projectX.entity.*;
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
	public CommandLineRunner commandLineRunner(ComplaintRepository complaintRepository,
											   EmployeeRepository employeeRepository,
											   UsersRepository usersRepository,
											   SellerRepository sellerRepository,
											   PushReceiverGroupRepository pushReceiverGroupRepository) {
		return runner -> {
			Seller tmpsell = sellerRepository.findBySellerId(1);

			PushReceiverGroup group = new PushReceiverGroup();
			group.setGroupName("Group 1");
			group.setSeller(tmpsell); // 设置卖家对象
			group.setGroupBuildTime(new Date()); // 设置建立时间
			group.setGroupUpdateTime(new Date()); // 设置更新时间


			pushReceiverGroupRepository.save(group);
        };
	}

	//使用Seller	Repository 帶入參數SellerId，反向找出Users
	private void findUserBySellerId(SellerRepository sellerRepository){
		Seller seller = sellerRepository.findBySellerId(1);
		Users user = seller.getUser();
		System.out.println(user.toString());
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




