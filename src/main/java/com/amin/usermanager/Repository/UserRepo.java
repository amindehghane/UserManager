package com.amin.usermanager.Repository;

import com.amin.usermanager.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
