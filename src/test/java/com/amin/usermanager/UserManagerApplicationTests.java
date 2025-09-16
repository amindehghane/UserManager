package com.amin.usermanager;

import com.amin.usermanager.Convertor.PersianDateConvertor;
import com.amin.usermanager.Dto.PersianDateDto;
import com.amin.usermanager.Service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


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
        LocalDate localDate = PersianDateConvertor.convertDate(persianDateDto);
        assertEquals(
                LocalDate.of(persianDateDto.getYear(), persianDateDto.getMonth(), persianDateDto.getDay())
                , localDate
        );
    }
}
