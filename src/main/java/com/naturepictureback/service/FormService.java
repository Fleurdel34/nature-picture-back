package com.naturepictureback.service;

import com.naturepictureback.models.Form;
import com.naturepictureback.repository.FormRepository;
import org.springframework.stereotype.Service;



@Service
public class FormService {

    private final FormRepository formRepository;

    public FormService(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    public void createForm(Form form) {
        this.formRepository.save(form);

    }

    public Form readByTitle(String title){
        return this.formRepository.findByTitle(title);
    }
}
