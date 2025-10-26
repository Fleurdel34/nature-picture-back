package com.naturepictureback.service;

import com.naturepictureback.models.Form;
import com.naturepictureback.repository.FormRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormService {

    private final FormRepository formRepository;

    public FormService(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    public void createForm(Form form) {
        this.formRepository.save(form);

    }

    public List<Form> readByTitle(String title){
        return this.formRepository.findAllByTitle(title);
    }


}
