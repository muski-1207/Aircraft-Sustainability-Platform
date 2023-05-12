package com.aerothon.dashboard.repositories;

import com.aerothon.dashboard.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String username);
}
