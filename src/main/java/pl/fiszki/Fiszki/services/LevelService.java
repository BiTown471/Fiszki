package pl.fiszki.Fiszki.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.fiszki.Fiszki.models.Level;
import pl.fiszki.Fiszki.repositories.LevelRepository;

import java.util.List;

@Service
public class LevelService  {

    private final LevelRepository levelRepository;

    @Autowired
    public LevelService(LevelRepository levelRepository) {
        this.levelRepository = levelRepository;
    }

    public List<Level> getLevels(){
        return levelRepository.findAll();
    }
}

