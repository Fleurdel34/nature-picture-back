package com.naturepictureback.controller;


import com.naturepictureback.models.Form;
import com.naturepictureback.service.FormService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    public void createForm(@RequestBody Form form) {
        this.formService.createForm(form);
    }

    @CrossOrigin(origins ="*")
    @GetMapping("/{title}")
    public List<Form> readByTitle(@PathVariable String title){
        return this.formService.readByTitle(title);
    }
}
