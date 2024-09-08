package com.example.gestionCPF.repository;

import com.example.gestionCPF.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
