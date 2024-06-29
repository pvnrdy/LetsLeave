package com.tickle.lms.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class LeaveTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long leaveTypeID;
    private String leaveTypeName;
    private float total;
    private long addedBy;
    private LocalDate fromDate;
    private LocalDate toDate;

    public long getLeaveTypeID() {
        return leaveTypeID;
    }

    public void setLeaveTypeID(long leaveTypeID) {
        this.leaveTypeID = leaveTypeID;
    }

    public String getLeaveTypeName() {
        return leaveTypeName;
    }

    public void setLeaveTypeName(String leaveTypeName) {
        this.leaveTypeName = leaveTypeName;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public long getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(long addedBy) {
        this.addedBy = addedBy;
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

}
