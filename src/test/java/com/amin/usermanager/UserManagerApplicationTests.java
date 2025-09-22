package com.amin.usermanager;

import com.amin.usermanager.Validation.UserValidation;
import com.amin.usermanager.Convertor.PersianDateConvertor;
import com.amin.usermanager.Dto.CreateRequestDto;
import com.amin.usermanager.Dto.PersianDateDto;
import com.amin.usermanager.Service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserManagerApplicationTests {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Test
    void contextLoads() {
    }

    @Test
    public void datTest() {
        PersianDateDto persianDateDto = new PersianDateDto();
        persianDateDto.setDay(10);
        persianDateDto.setMonth(5);
        persianDateDto.setYear(1374);
        LocalDate persianDate = PersianDateConvertor.convertDateToMiladi(persianDateDto);
        assertEquals(LocalDate.of(persianDateDto.getYear(), persianDateDto.getMonth(), persianDateDto.getDay()), persianDate);
    }

    @Test
    public void phoneNumberTest() {
        CreateRequestDto dto = new CreateRequestDto();
        dto.setPhoneNumber("123456789");//شماره اشتباه
        assertFalse(UserValidation.phoneNumberValidation(dto), "شماره تلفن باید با 09 شروع شود !");
    }

    @Test
    public void phoneNumberTest_ValidNumber_ShouldReturnTrue() {
        CreateRequestDto dto = new CreateRequestDto();
        dto.setPhoneNumber("09123456789"); // شماره صحیح
        assertTrue(UserValidation.phoneNumberValidation(dto), "شماره تلفن معتبر باید true برگرداند!");
    }

    @Test
    public void phoneNumberIsNull_ShouldReturnFalse() {
        CreateRequestDto dto = new CreateRequestDto();
        dto.setPhoneNumber(null);
        assertFalse(UserValidation.phoneNumberValidation(dto), "شماره تلفن null باید نامعتبر باشد");
    }

    @Test
    public void phoneNumberLessThan11Digits_ShouldReturnFalse() {
        CreateRequestDto dto = new CreateRequestDto();
        dto.setPhoneNumber("0912345678"); // 10 رقم
        assertFalse(UserValidation.phoneNumberValidation(dto), "شماره تلفن کمتر از 11 رقم باید نامعتبر باشد");
    }

    @Test
    public void phoneNumberMoreThan11Digits_ShouldReturnFalse() {
        CreateRequestDto dto = new CreateRequestDto();
        dto.setPhoneNumber("091234567890"); // 12 رقم
        assertFalse(UserValidation.phoneNumberValidation(dto), "شماره تلفن بیشتر از 11 رقم باید نامعتبر باشد");
    }
    @Test
    public void validPhoneNumber_ShouldReturnTrue() {
        CreateRequestDto dto = new CreateRequestDto();
        dto.setPhoneNumber("09123456789"); // دقیقاً 11 رقم و با 09 شروع می‌شود
        assertTrue(UserValidation.phoneNumberValidation(dto), "شماره تلفن معتبر است");
    }
}