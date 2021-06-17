package pl.fiszki.Fiszki.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.fiszki.Fiszki.models.*;
import pl.fiszki.Fiszki.models.flashcard.FlashcardDto;
import pl.fiszki.Fiszki.models.flashcard.FlashcardMapper;
import pl.fiszki.Fiszki.repositories.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class FlashcardService {

    private final FlashcardRepository flashcardRepository;
    private final EnglishWordRepository englishWordRepository;
    private final PolishWordRepository polishWordRepository;
    private final TopicRepository topicRepository;
    private final PartOfSpeechRepository partOfSpeechRepository;
    private final LevelRepository levelRepository;

    @Autowired
    public FlashcardService(FlashcardRepository flashcardRepository, EnglishWordRepository englishWordRepository, PolishWordRepository polishWordRepository, TopicRepository topicRepository, PartOfSpeechRepository partOfSpeechRepository, LevelRepository levelRepository) {
        this.flashcardRepository = flashcardRepository;
        this.englishWordRepository = englishWordRepository;
        this.polishWordRepository = polishWordRepository;
        this.topicRepository = topicRepository;
        this.partOfSpeechRepository = partOfSpeechRepository;
        this.levelRepository = levelRepository;
    }

    public List<FlashcardDto> getFlashcardsList(){
        List<FlashcardDto> list = new ArrayList<>();
        for (Flashcard fdto:flashcardRepository.findAll()) {
            list.add(FlashcardMapper.flashcardDto(fdto));
        }
        return list;
    }

    public FlashcardDto getRandomFlashcard(){
        if (flashcardRepository.findAll().size()>0) {
            int number = new Random().nextInt(flashcardRepository.findAll().size());
            return FlashcardMapper.flashcardDto(flashcardRepository.findAll().get(number));
        }else {
            return null;
        }
    }

    public void addFlashcard(FlashcardDto flashcard) {
        Flashcard fc = new Flashcard();
        EnglishWord englishWord = new EnglishWord();
        PolishWord polishWord = new PolishWord();
        PartOfSpeech pos = partOfSpeechRepository.findById(Long.valueOf(flashcard.getPartOfSpeech())).stream().findFirst().orElse(null);
        Topic topic = topicRepository.findById(Long.valueOf(flashcard.getTopic())).stream().findFirst().orElse(null);
        Level level = levelRepository.findById(Long.valueOf(flashcard.getLevel())).stream().findFirst().orElse(null);
        fc.setPartOfSpeech(pos);
        fc.setTopic(topic);
        fc.setLevel(level);
        englishWord.setName(flashcard.getEnglishWord());
        englishWord.setDescription(flashcard.getEnglishWordDesc());
        polishWord.setName(flashcard.getPolishWord());
        polishWord.setDescription(flashcard.getPolishWordDesc());


        if (englishWordRepository.findAllByName(flashcard.getEnglishWord()) == null){
            englishWordRepository.save(englishWord);
        }
        fc.setEnglishWord(englishWord);
        if (polishWordRepository.findAllByName(flashcard.getPolishWord()) == null){
            polishWordRepository.save(polishWord);
        }
        fc.setPolishWord(polishWord);




        System.out.println(fc);
        flashcardRepository.save(fc);
    }

    public void removeFlashcard(Long wordId){
        if (!flashcardRepository.existsById(wordId)){
            throw new  IllegalStateException("Flashcard not exist.");
        }
        flashcardRepository.deleteById(wordId);
    }


    public  FlashcardDto getFlashcardById(Long id){
        return flashcardRepository
                .findById(id)
                .map(FlashcardMapper::flashcardDto)
                .orElseThrow(() -> new  IllegalStateException("Flashcard not exist."));
    }
    public  List<FlashcardDto> getFlashcardByTopicId(Long id){
        List<FlashcardDto> list = new ArrayList<>();
        for (Flashcard fdto:flashcardRepository.findAllByTopicId(id)) {
            list.add(FlashcardMapper.flashcardDto(fdto));
        }
        return list;
    }
}
