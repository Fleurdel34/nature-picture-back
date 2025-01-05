package com.naturepictureback.controller;


import com.naturepictureback.models.Form;
import com.naturepictureback.service.FormService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping(path = "form")
public class FormController {

    private final FormService formService;


    public FormController(FormService formService) {
        this.formService = formService;
    }

    @CrossOrigin(origins = "*")
    @ResponseStatus(value= HttpStatus.CREATED)
    @PostMapping
    public String create(@ModelAttribute Form form,@RequestParam("imageFile") MultipartFile imageFile) throws IOException, IOException{
        this.formService.create(form, imageFile);
        return "file update";
    }

    @GetMapping
    public List<Form> read(){
        return this.formService.read();
    }
}
