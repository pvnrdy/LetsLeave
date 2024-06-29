package com.tickle.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tickle.lms.model.Holiday;


public interface HolidayRepository extends JpaRepository<Holiday, Long>{
    Holiday findByHolidayID(long holidayID);
}