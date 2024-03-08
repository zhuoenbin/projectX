package com.ispan.projectX.dao;

import com.ispan.projectX.entity.Complaint;
import com.ispan.projectX.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ComplaintRepository extends JpaRepository<Complaint,Integer> {

      //使用員工ID反向找到該員工所有的Complaint
      List<Complaint> findByEmployeeEmployeeId(Integer employeeId);

      Complaint findByComplaintId(Integer complaintId);
}
