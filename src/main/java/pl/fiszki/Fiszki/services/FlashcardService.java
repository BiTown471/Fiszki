package pl.fiszki.Fiszki.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.fiszki.Fiszki.models.Flashcard;
import pl.fiszki.Fiszki.models.flashcard.FlashcardDto;
import pl.fiszki.Fiszki.models.flashcard.FlashcardMapper;
import pl.fiszki.Fiszki.repositories.EnglishWordRepository;
import pl.fiszki.Fiszki.repositories.FlashcardRepository;

import java.util.List;
import java.util.Random;

@Service
public class FlashcardService {

    private final FlashcardRepository flashcardRepository;
    private final EnglishWordRepository englishWordRepository;

    @Autowired
    public FlashcardService(FlashcardRepository flashcardRepository, EnglishWordRepository englishWordRepository) {
        this.flashcardRepository = flashcardRepository;
        this.englishWordRepository = englishWordRepository;
    }

    public List<Flashcard> getFlashcardsList(){

        return flashcardRepository.findAll();
    }

    public FlashcardDto getRandomFlashcard(){
        if (flashcardRepository.findAll().size()>0) {
            int number = new Random().nextInt(flashcardRepository.findAll().size());
            return FlashcardMapper.flashcardDto(flashcardRepository.findAll().get(number));
        }else {
            return null;
        }
    }

    public void addFlashcard(Flashcard flashcard) {
        System.out.println(flashcard);
        flashcardRepository.save(flashcard);
    }

    public void removeFlashcard(Long wordId){
        if (!flashcardRepository.existsById(wordId)){
            throw new  IllegalStateException("Flashcard not exist.");
        }
        flashcardRepository.deleteById(wordId);
    }
}
