package pl.fiszki.Fiszki.models.flashcard;

import pl.fiszki.Fiszki.models.Flashcard;

public class FlashcardMapper {
    public static FlashcardDto flashcardDto(Flashcard flashcard){
        FlashcardDto flashcardDto = new FlashcardDto();
        flashcardDto.setId(flashcard.getId());
        flashcardDto.setEnglishWord(flashcard.getEnglishWord().getName());
        flashcardDto.setEnglishWordDesc(flashcard.getEnglishWord().getDescription());
        flashcardDto.setPolishWord(flashcard.getPolishWord().getName());
        flashcardDto.setPolishWordDesc(flashcard.getPolishWord().getDescription());
        flashcardDto.setPartOfSpeech(flashcard.getPartOfSpeech().getName());
        flashcardDto.setTopic(flashcard.getTopic().getName());
        flashcardDto.setLevel(flashcard.getLevel().getName());
        return flashcardDto;
    }

}
