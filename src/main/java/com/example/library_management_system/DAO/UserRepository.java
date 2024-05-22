package com.example.library_management_system.DAO;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library_management_system.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}