package fiszki.pl.Fiszki.controlers;

import fiszki.pl.Fiszki.model.*;
import fiszki.pl.Fiszki.repository.FlashCardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlashCardsController {

    private final FlashCardsRepository flashCardsRepository;

    @Autowired
    public FlashCardsController(FlashCardsRepository flashCardsRepository){this.flashCardsRepository = flashCardsRepository;}

    @GetMapping("/flashCards")
    public List<FlashCards> flashCards(){
/*        flashCardsRepository.save(
                new FlashCards(
                        new EnglishWord("desk",""),
                        new PolishWord("biurko",""),
                        new PartsOfSpeech("noun"),
                        new Topics("home"),
                        new Levels("A1")));*/
        return flashCardsRepository.findAll();
    }



}
