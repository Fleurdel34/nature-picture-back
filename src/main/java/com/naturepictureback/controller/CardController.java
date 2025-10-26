package com.naturepictureback.controller;

import com.naturepictureback.models.Form;
import com.naturepictureback.service.CardService;
import com.naturepictureback.service.FormService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "card")
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }


    @CrossOrigin(origins ="*")
    @GetMapping("/{id}")
    public Optional<Form> readById(@PathVariable Long id){
        return this.cardService.readById(id);
    }
}
