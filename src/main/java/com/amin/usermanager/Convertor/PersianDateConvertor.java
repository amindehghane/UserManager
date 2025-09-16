package com.amin.usermanager.Convertor;

import com.amin.usermanager.Dto.PersianDateDto;

import java.time.LocalDate;

public class PersianDateConvertor {
    public static LocalDate convertDate(PersianDateDto persianDateDto) {
        return LocalDate.of(persianDateDto.getYear(), persianDateDto.getMonth(), persianDateDto.getDay());
    }
}