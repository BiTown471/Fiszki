package pl.fiszki.Fiszki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.fiszki.Fiszki.models.EnglishWord;
import pl.fiszki.Fiszki.services.EnglishWordService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class EnglishWordController {
    EnglishWordService englishWordService;

    public EnglishWordController(EnglishWordService englishWordService) {
        this.englishWordService = englishWordService;
    }

    @GetMapping("/englishwords")
    public List<EnglishWord> getEnglishWords(){
        return englishWordService.getEnglisWords();
    }
}
