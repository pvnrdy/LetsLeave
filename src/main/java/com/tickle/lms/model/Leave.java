package com.tickle.lms.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long leaveID;
    private long userID;
    private long approverID;
    private String reason;
    private long leaveType;
    private LocalDate fromDate;
    private LocalDate toDate;
    private int status;

    public long getLeaveID() {
        return leaveID;
    }

    public void setLeaveID(long leaveID) {
        this.leaveID = leaveID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public long getApproverID() {
        return approverID;
    }

    public void setApproverID(long approverID) {
        this.approverID = approverID;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public long getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(long leaveType) {
        this.leaveType = leaveType;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
