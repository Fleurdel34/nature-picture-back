package com.naturepictureback.service;

import com.naturepictureback.models.Form;
import com.naturepictureback.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CardService {

    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public Optional<Form> readById(Long id){
        return this.cardRepository.findFormById(id);
    }
}
