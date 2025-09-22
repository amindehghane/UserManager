package com.amin.usermanager.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateRequestDto {

    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @Email(message = "ایمیل نامعتبر است!")
    private String email;
    @NotNull
    private PersianDateDto dateOfBirth;
    @NotNull
    private String phoneNumber;


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