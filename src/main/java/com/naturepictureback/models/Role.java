package com.naturepictureback.models;

import com.naturepictureback.enumeration.TypeRole;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TypeRole role;

    public Role() {
    }
}
