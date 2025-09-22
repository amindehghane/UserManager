package com.amin.usermanager.repository;

import com.amin.usermanager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
