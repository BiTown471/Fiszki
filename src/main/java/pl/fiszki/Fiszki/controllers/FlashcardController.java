package pl.fiszki.Fiszki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.fiszki.Fiszki.models.Flashcard;
import pl.fiszki.Fiszki.services.FlashcardService;

import java.util.List;

@RestController
public class FlashcardController {
    private final FlashcardService flashcardService;

    public FlashcardController(FlashcardService flashcardService) {
        this.flashcardService = flashcardService;
    }

    @GetMapping("/flashcards")
    public List<Flashcard> getAll(){
        return flashcardService.getFlashcards();
    }
}
