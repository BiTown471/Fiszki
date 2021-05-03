package fiszki.pl.Fiszki.controlers;

import fiszki.pl.Fiszki.model.Levels;
import fiszki.pl.Fiszki.repository.LevelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LevelsController  {
    private final LevelsRepository levelsRepository;

    @Autowired
    public LevelsController(LevelsRepository levelsRepository) {
        this.levelsRepository = levelsRepository;
    }

    @GetMapping("/levels")
    public List<Levels> levels(){
        //model.addAttribute(new L)
        return levelsRepository.findAll();
    }
    /*@GetMapping("/levels")
    public String levelsForm(Model model) {
        model.addAttribute("levels", new Levels());
        return "levels";
    }
    @PostMapping("/levels")
    public String levelsSubmit(@ModelAttribute Levels levels, Model model) {
        //model.addAttribute("levels", levels);
        return "result";
    }
    @PutMapping("/levels/{name}")
    public void addleves(@PathVariable(value = "name") String name){
        levelsRepository.save(new Levels(name));
    }*/

}
