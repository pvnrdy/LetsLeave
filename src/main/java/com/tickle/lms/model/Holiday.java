package com.tickle.lms.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Holiday {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long holidayID;
    private String holidayName;
    private LocalDate holidayDate;
    private long addedBy;

    public long getHolidayID() {
        return holidayID;
    }

    public void setHolidayID(long holidayID) {
        this.holidayID = holidayID;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    public LocalDate getHolidayDate() {
        return holidayDate;
    }

    public void setHolidayDate(LocalDate holidayDate) {
        this.holidayDate = holidayDate;
    }

    public long getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(long addedBy) {
        this.addedBy = addedBy;
    }

}
