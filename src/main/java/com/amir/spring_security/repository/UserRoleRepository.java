package com.amir.spring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amir.spring_security.model.UserRole;

import java.util.Optional;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> { // Use Long as the ID type
    Optional<UserRole> findByAuthority(String authority); // Correct method name and parameter type
}