package pl.fiszki.Fiszki.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.fiszki.Fiszki.models.Level;
import pl.fiszki.Fiszki.services.LevelService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class LevelControler {

    private final LevelService levelService;

    @Autowired
    public LevelControler(LevelService levelService) {
        this.levelService = levelService;
    }

    @GetMapping("/levels")
    public List<Level> getLevels(){
        return this.levelService.getLevels();

    }
}
