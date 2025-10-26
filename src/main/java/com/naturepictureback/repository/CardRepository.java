package com.naturepictureback.repository;

import com.naturepictureback.models.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardRepository extends JpaRepository<Form, Long> {
    Optional<Form> findFormById(Long id);
}
