package com.tickle.lms.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class CompOff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long compOffID;
    private long userID;
    private int providerID;
    private LocalDate fromDate;
    private LocalDate toDate;
    private String reason;

    public long getCompOffID() {
        return compOffID;
    }

    public void setCompOffID(long compOffID) {
        this.compOffID = compOffID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public int getProviderID() {
        return providerID;
    }

    public void setProviderID(int providerID) {
        this.providerID = providerID;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
