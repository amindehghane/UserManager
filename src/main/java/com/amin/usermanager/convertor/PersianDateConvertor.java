package com.amin.usermanager.convertor;

import com.amin.usermanager.dto.PersianDateDto;
import com.github.mfathi91.time.PersianDate;

import java.time.LocalDate;

public class PersianDateConvertor {
    public static LocalDate convertDateToMiladi(PersianDateDto persianDateDto) {
        return PersianDate.of(
                persianDateDto.getYear(),
                persianDateDto.getMonth(),
                persianDateDto.getDay()
        ).toGregorian();
    }

    public static PersianDateDto convertDateToShamsi(LocalDate localDate) {
        PersianDate persianDate = PersianDate.fromGregorian(localDate);
        PersianDateDto dto = new PersianDateDto();
        dto.setYear(persianDate.getYear());
        dto.setMonth(persianDate.getMonthValue());
        dto.setDay(persianDate.getDayOfMonth());
        return dto;
    }
}