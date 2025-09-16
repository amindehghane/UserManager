package com.amin.usermanager.Service;

import com.amin.usermanager.Dto.CreateRequestDto;
import com.amin.usermanager.Dto.CreateResponseDto;

public interface UserService {

    CreateResponseDto save(CreateRequestDto createRequestDto);

    CreateResponseDto get(Long id);

    CreateResponseDto update(Long id, CreateRequestDto createRequestDto);

    void delete(Long id);
}