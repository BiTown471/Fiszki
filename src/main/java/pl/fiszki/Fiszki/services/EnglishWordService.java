package pl.fiszki.Fiszki.services;

import org.springframework.stereotype.Service;
import pl.fiszki.Fiszki.models.EnglishWord;
import pl.fiszki.Fiszki.repositories.EnglishWordRepository;

import java.util.List;

@Service
public class EnglishWordService {
    private final EnglishWordRepository englishWordRepository;

    public EnglishWordService(EnglishWordRepository englishWordRepository) {
        this.englishWordRepository = englishWordRepository;
    }


    public List<EnglishWord> getEnglisWords(){return englishWordRepository.findAll();}

}
