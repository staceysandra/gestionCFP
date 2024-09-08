package com.example.gestionCPF.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String passWord;
    private int tel;

  /*  @ManyToMany
    @JoinTable(name = "user_rule",
            joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_rule", referencedColumnName = "id"))
    private List<Rule> rules = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Speciality speciality;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private KafkaProperties.Retry.Topic topic;*/
}