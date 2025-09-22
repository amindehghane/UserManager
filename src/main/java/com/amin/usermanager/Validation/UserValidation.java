package com.amin.usermanager.Validation;

import com.amin.usermanager.Dto.CreateRequestDto;

public class UserValidation {

    public static boolean phoneNumberValidation(CreateRequestDto createRequestDto) {
        if (createRequestDto.getPhoneNumber() == null) {
            return false;
        } else if (createRequestDto.getPhoneNumber().length() > 11) {
            return false;
        } else if (createRequestDto.getPhoneNumber().length() < 11) {
            return false;
        } else if (createRequestDto.getPhoneNumber().charAt(0) != '0' ||
                createRequestDto.getPhoneNumber().charAt(1) != '9') {
            return false;
        } else
            return true;
    }
}
