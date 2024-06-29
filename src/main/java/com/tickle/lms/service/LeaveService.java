package com.tickle.lms.service;

import com.tickle.lms.model.Leave;

public interface LeaveService {
    Leave applyLeave(Leave leave);
    Leave approveLeave(Leave leave);
}
