package pl.fiszki.Fiszki.services;

import org.springframework.stereotype.Service;
import pl.fiszki.Fiszki.models.Flashcard;
import pl.fiszki.Fiszki.models.flashcard.FlashcardDto;
import pl.fiszki.Fiszki.models.flashcard.FlashcardMapper;
import pl.fiszki.Fiszki.repositories.FlashcardRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class FlashcardService {

    private final FlashcardRepository flashcardRepository;

    public FlashcardService(FlashcardRepository flashcardRepository) {
        this.flashcardRepository = flashcardRepository;
    }

    public List<Flashcard> getFlashcardsList(){

        return flashcardRepository.findAll();
    }

    public FlashcardDto getRandomFlashcard(){
        int number = new Random().nextInt(flashcardRepository.findAll().size());
        return FlashcardMapper.flashcardDto(flashcardRepository.findAll().get(number));
    }
//    public Flashcard getflashcardById(Long id){
//        return flashcardRepository.findById(id);
//    }
}
