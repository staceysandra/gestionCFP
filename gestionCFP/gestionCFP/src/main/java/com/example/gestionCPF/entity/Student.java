package com.example.gestionCPF.entity;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends User{
    private String studentId;
    private String registrationNumber;
}
