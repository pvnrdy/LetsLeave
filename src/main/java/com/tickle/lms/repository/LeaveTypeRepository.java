package com.tickle.lms.repository;

import com.tickle.lms.model.LeaveTypes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveTypeRepository extends JpaRepository<LeaveTypes, Long>{
   
}