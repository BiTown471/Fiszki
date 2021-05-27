package pl.fiszki.Fiszki.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.fiszki.Fiszki.models.EnglishWord;
import pl.fiszki.Fiszki.repositories.EnglishWordRepository;

import java.util.List;

@Service
public class EnglishWordService {
    private final EnglishWordRepository englishWordRepository;

    @Autowired
    public EnglishWordService(EnglishWordRepository englishWordRepository) {
        this.englishWordRepository = englishWordRepository;
    }


    public List<EnglishWord> getEnglisWords(){
        return englishWordRepository.findAll();
    }

    public void addNewEnglisWord(EnglishWord englishWord) {
        englishWordRepository.save(englishWord);
    }

    public void removeWord(Long wordId){
        if (!englishWordRepository.existsById(wordId)){
            throw new  IllegalStateException("Polish word not exist.");
        }
        englishWordRepository.deleteById(wordId);
    }
}
