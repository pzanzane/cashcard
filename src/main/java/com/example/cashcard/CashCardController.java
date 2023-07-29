package com.example.cashcard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/cashcards")
public class CashCardController {

    private CashCardRepository cashCardRepository;

    public CashCardController(CashCardRepository cashCardRepository) {
        this.cashCardRepository = cashCardRepository;
    }

    @GetMapping("/{requestedId}")
    public ResponseEntity<CashCard> fundById(@PathVariable Long requestedId) {

        Optional<CashCard> optional = cashCardRepository.findById(requestedId);
        if (optional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        CashCard cashCard = optional.get();
        return ResponseEntity.ok(/* body= */ cashCard);
    }
}
