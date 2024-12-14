package com.naturepictureback.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Entity
@Table(name="form")
public class Form {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(
            nullable = false
    )
    private String description;
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String filename;

    public Form() {
    }

    public Form(String title, String description, String filename) {
        this.title = title;
        this.description = description;
        this.filename = filename;
    }


}
