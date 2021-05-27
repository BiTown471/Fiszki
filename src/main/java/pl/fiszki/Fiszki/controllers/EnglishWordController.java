package pl.fiszki.Fiszki.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.fiszki.Fiszki.models.EnglishWord;
import pl.fiszki.Fiszki.services.EnglishWordService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class EnglishWordController {

    EnglishWordService englishWordService;

    @Autowired
    public EnglishWordController(EnglishWordService englishWordService) {
        this.englishWordService = englishWordService;
    }


    @GetMapping("/english-words")
    public List<EnglishWord> getEnglishWords(){
        return englishWordService.getEnglisWords();
    }

    @PostMapping("/english-word")
    public void postEnglisWord(EnglishWord englishWord){
        System.out.println(englishWord.getName());
        englishWordService.addNewEnglisWord(englishWord);
    }

    @DeleteMapping(path = "/english-word/{id}")
    public void  deletePolishWord(@PathVariable Long id){
        englishWordService.removeWord(id);
    }


}
