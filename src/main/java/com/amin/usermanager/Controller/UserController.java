package com.amin.usermanager.Controller;

import com.amin.usermanager.Dto.CreateRequestDto;
import com.amin.usermanager.Dto.CreateResponseDto;
import com.amin.usermanager.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/apis")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public CreateResponseDto save(@RequestBody CreateRequestDto requestDto) {
        return userService.save(requestDto);
    }

    @GetMapping("/{id}")
    public CreateResponseDto findById(@PathVariable Long id) {
        return userService.get(id);
    }

    @PutMapping("/{id}")
    public CreateResponseDto update(@PathVariable Long id, @RequestBody CreateRequestDto requestDto) {
        return userService.update(id, requestDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }
}