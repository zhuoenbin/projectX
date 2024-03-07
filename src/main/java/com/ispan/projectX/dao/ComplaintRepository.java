package com.ispan.projectX.dao;


import com.ispan.projectX.entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintRepository extends JpaRepository<Complaint,Integer> {
    // 還沒測試
}
