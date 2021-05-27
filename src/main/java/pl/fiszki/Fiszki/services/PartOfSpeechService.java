package pl.fiszki.Fiszki.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.fiszki.Fiszki.models.PartOfSpeech;
import pl.fiszki.Fiszki.repositories.PartOfSpeechRepository;

import java.util.List;

@Service
public class PartOfSpeechService {

    private final PartOfSpeechRepository partOfSpeechRepository;

    @Autowired
    public PartOfSpeechService(PartOfSpeechRepository partOfSpeechRepository) {
        this.partOfSpeechRepository = partOfSpeechRepository;
    }

    public List<PartOfSpeech> getAll(){
        return partOfSpeechRepository.findAll();
    }

    public void addPos(PartOfSpeech pos) {
        partOfSpeechRepository.save(pos);
    }
}

