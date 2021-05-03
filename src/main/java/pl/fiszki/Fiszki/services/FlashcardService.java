package pl.fiszki.Fiszki.services;

import org.springframework.stereotype.Service;
import pl.fiszki.Fiszki.models.Flashcard;
import pl.fiszki.Fiszki.repositories.FlashcardRepository;

import java.util.List;

@Service
public class FlashcardService {

    private final FlashcardRepository flashcardRepository;

    public FlashcardService(FlashcardRepository flashcardRepository) {
        this.flashcardRepository = flashcardRepository;
    }

    public List<Flashcard> getFlashcards(){

        return flashcardRepository.findAll();
    }
}
