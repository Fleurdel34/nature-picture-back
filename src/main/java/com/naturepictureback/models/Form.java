package com.naturepictureback.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


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

    @Column(nullable = false)
    private Date date;

    public Form() {
    }


    public Form(String title, String description, String filename, Date date) {
        this.title = title;
        this.description = description;
        this.filename = filename;
        this.date = date;
    }
}
