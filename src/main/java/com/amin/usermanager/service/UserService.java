package com.amin.usermanager.service;

import com.amin.usermanager.dto.CreateRequestDto;
import com.amin.usermanager.dto.CreateResponseDto;

public interface UserService {

    CreateResponseDto save(CreateRequestDto createRequestDto);

    CreateResponseDto get(Long id);

    CreateResponseDto update(Long id, CreateRequestDto createRequestDto);

    void delete(Long id);
}