package pl.fiszki.Fiszki.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.fiszki.Fiszki.models.PartOfSpeech;
import pl.fiszki.Fiszki.models.Topic;
import pl.fiszki.Fiszki.services.PartOfSpeechService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class POSController {

    private final PartOfSpeechService posService;

    @Autowired
    public POSController(PartOfSpeechService posService) {
        this.posService = posService;
    }

    @GetMapping("/part-of-speech")
    public List<PartOfSpeech> getAll(){
        return posService.getAll();
    }

    @PostMapping("/part-of-speech")
    public void addPos(PartOfSpeech pos){
        posService.addPos(pos);
    }
}
