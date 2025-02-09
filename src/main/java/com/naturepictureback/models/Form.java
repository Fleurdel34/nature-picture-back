package com.naturepictureback.models;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name= "form")
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String filename;

    public Form() {
    }

    public Form(String title, String description, String filename) {
        this.title = title;
        this.description = description;
        this.filename = filename;
    }
}
