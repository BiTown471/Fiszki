package pl.fiszki.Fiszki.services;

import org.springframework.stereotype.Service;
import pl.fiszki.Fiszki.repositories.PolishWordRepository;

@Service
public class PolishWordService {

    private final PolishWordRepository polishWordRepository;

    public PolishWordService(PolishWordRepository polishWordRepository) {
        this.polishWordRepository = polishWordRepository;
    }


}
