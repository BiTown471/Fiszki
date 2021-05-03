package pl.fiszki.Fiszki.services;

import org.springframework.stereotype.Service;
import pl.fiszki.Fiszki.models.PartOfSpeech;
import pl.fiszki.Fiszki.repositories.PartOfSpeechRepository;

@Service
public class PartOfSpeechService {

    private final PartOfSpeechRepository partOfSpeechRepository;

    public PartOfSpeechService(PartOfSpeechRepository partOfSpeechRepository) {
        this.partOfSpeechRepository = partOfSpeechRepository;
    }
}

