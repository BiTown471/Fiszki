package pl.fiszki.Fiszki.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.fiszki.Fiszki.models.PolishWord;
import pl.fiszki.Fiszki.repositories.PolishWordRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class PolishWordService {

    private final PolishWordRepository polishWordRepository;
    @Autowired
    public PolishWordService(PolishWordRepository polishWordRepository) {
        this.polishWordRepository = polishWordRepository;
    }

    public List<PolishWord> getPolishWords(){return polishWordRepository.findAll();}

    public List<PolishWord> getPolWordsToAnswer(){
        List<PolishWord> polishWordList = polishWordRepository.findAll();
        Collections.shuffle(polishWordList,new Random());
        return polishWordList.subList(0,3);
    }
    public List<String> PolWordsToAnswer(){
        List<PolishWord> polishWordList = polishWordRepository.findAll();
        Collections.shuffle(polishWordList,new Random());

        return polishWordList
                .stream()
                //.limit(3)
                .map(s -> s.getName()).collect(Collectors.toList()).subList(0,3);
    }


    public void addNewWord(PolishWord polishWord) {
        polishWordRepository.save(polishWord);
    }

    public void removeWord(Long wordId){
        if (!polishWordRepository.existsById(wordId)){
            throw new  IllegalStateException("Polish word not exist.");
        }
        polishWordRepository.deleteById(wordId);
    }
}
