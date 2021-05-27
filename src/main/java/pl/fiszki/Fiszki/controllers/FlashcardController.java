package pl.fiszki.Fiszki.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.fiszki.Fiszki.models.Flashcard;
import pl.fiszki.Fiszki.models.flashcard.FlashcardDto;
import pl.fiszki.Fiszki.services.FlashcardService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class FlashcardController {
    private final FlashcardService flashcardService;
    @Autowired
    public FlashcardController(FlashcardService flashcardService) {
        this.flashcardService = flashcardService;
    }

    @GetMapping("/flashcards")
    public List<Flashcard> getAll(){
        return flashcardService.getFlashcardsList();
    }

    @GetMapping("/one-flashcard")
    public FlashcardDto getOne(){return flashcardService.getRandomFlashcard();}

    @PostMapping("flashcard")
    public void addFlashcard(Flashcard flashcard){
        flashcardService.addFlashcard(flashcard);
    }

    @DeleteMapping(path = "/flashcard/{id}")
    public void  deletePolishWord(@PathVariable Long id){
        flashcardService.removeFlashcard(id);
    }
}
