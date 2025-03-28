package com.naturepictureback.repository;

import com.naturepictureback.models.Form;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface FormRepository extends JpaRepository<Form, Long> {
    List<Form> findByTitle(String title);

}
