package com.naturepictureback.models;

import jakarta.persistence.*;

import jakarta.validation.constraints.Email;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name= "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private Date dateOfBirth;

    @Email
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    private Role role;

    public User() {
    }
}
