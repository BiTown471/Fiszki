package pl.fiszki.Fiszki.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.fiszki.Fiszki.models.PolishWord;
import pl.fiszki.Fiszki.services.PolishWordService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PolishWordController {

    private final PolishWordService polishWordService;


    @Autowired
    public PolishWordController(PolishWordService polishWordService) {
        this.polishWordService = polishWordService;
    }

    @GetMapping("/polish-words")
    public List<PolishWord> getPolishWords(){
        return polishWordService.getPolishWords();
    }

    @GetMapping("/random-polish-word")
    public List<PolishWord> getRandomWord(){
        return polishWordService.getPolWordsToAnswer();
    }

    @GetMapping("/random-polish-words")
    public List<String> RandomWord() {
        return polishWordService.PolWordsToAnswer();
    }

    @PostMapping("/polish-word")
    public void postPolishWord(PolishWord polishWord){
        polishWordService.addNewWord(polishWord);
    }

    @DeleteMapping(path = "/polish-word/{id}")
    public void  deletePolishWord(@PathVariable Long id){
        polishWordService.removeWord(id);
    }
}
