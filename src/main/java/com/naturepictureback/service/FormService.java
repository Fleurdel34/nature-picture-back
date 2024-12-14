package com.naturepictureback.service;

import com.naturepictureback.models.Form;
import com.naturepictureback.repository.FormRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Service
public class FormService {

    private final FormRepository formRepository;

    public FormService(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    public Form create(Form form, MultipartFile file) throws IOException {

        form.setFilename(Base64.getEncoder().encodeToString(file.getBytes()));
        return this.formRepository.save(form);

    }

    public List<Form> read(){
        return this.formRepository.findAll();
    }
}
