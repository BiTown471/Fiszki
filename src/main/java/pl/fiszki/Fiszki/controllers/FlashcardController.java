package pl.fiszki.Fiszki.controllers;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.fiszki.Fiszki.models.Flashcard;
import pl.fiszki.Fiszki.models.flashcard.FlashcardDto;
import pl.fiszki.Fiszki.models.flashcard.FlashcardMapper;
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

    @GetMapping("/flashcard")
    public List<FlashcardDto> getAll(){
        return flashcardService.getFlashcardsList();
    }

    @GetMapping(path ="/flashcard/{id}")
    public FlashcardDto getFlashcardById(@PathVariable Long id){
        return flashcardService.getFlashcardById(id);
    }

    @GetMapping(path ="/flashcard/topic/{id}")
    public List<FlashcardDto> getFlashcardByTopicId(@PathVariable Long id){
        return flashcardService.getFlashcardByTopicId(id);
    }


    @GetMapping("/oneflashcard")
    public FlashcardDto getOne(){return flashcardService.getRandomFlashcard();}

    @PostMapping("flashcard/")
    public void addFlashcard(FlashcardDto flashcardDto){
        flashcardService.addFlashcard(flashcardDto);
    }


    @DeleteMapping(path = "/flashcard/{id}")
    public void  deletePolishWord(@PathVariable Long id){
        flashcardService.removeFlashcard(id);
    }
}
