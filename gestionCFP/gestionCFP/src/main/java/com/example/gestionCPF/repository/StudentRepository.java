package com.example.gestionCPF.repository;

import com.example.gestionCPF.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
