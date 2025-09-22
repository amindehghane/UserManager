package com.amin.usermanager.Dto;

import com.github.mfathi91.time.PersianDate;

import java.time.LocalDate;

public class CreateResponseDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private PersianDateDto dateOfBirth;
    private String phoneNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PersianDateDto getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(PersianDateDto dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}