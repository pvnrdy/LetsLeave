package com.tickle.lms.repository;

import java.util.List;

import com.tickle.lms.model.Leave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<Leave, Long>{
    List<Leave> findByUserId(Long userID);
    List<Leave> findByApprovedId(Long userID);
}
