package com.tickle.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tickle.lms.service.LeaveService;
import com.tickle.lms.model.Leave;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/leaves", method=RequestMethod.GET)

public class LeaveController {
    @Autowired
    private LeaveService leaveService;

    @PostMapping("/apply")
    public ResponseEntity<Leave> applyLeave(@RequestBody Leave leave) {
        Leave appliedLeave = leaveService.applyLeave(leave);
        return ResponseEntity.ok(appliedLeave);
    }

    @PutMapping("/approve/{id}")
    public ResponseEntity<Leave> approveLeave(@RequestBody Leave leave) {
        Leave approvedLeave = leaveService.approveLeave(leave);
        return ResponseEntity.ok(approvedLeave);
    }


}
