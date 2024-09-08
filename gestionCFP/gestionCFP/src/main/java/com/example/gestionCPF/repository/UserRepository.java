package com.example.gestionCPF.repository;

import com.example.gestionCPF.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
