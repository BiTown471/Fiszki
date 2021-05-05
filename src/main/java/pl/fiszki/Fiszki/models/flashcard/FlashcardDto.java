package pl.fiszki.Fiszki.models.flashcard;

public class FlashcardDto {
    private Long id;
    private String englishWord;
    private String englishWordDesc;
    private String polishWord;
    private String polishWordDesc;
    private String partOfSpeech;
    private String topic;
    private String level;

    public Long getId() {
        return id;
    }

    public String getEnglishWordDesc() {
        return englishWordDesc;
    }

    public void setEnglishWordDesc(String englishWordDesc) {
        this.englishWordDesc = englishWordDesc;
    }

    public String getPolishWordDesc() {
        return polishWordDesc;
    }

    public void setPolishWordDesc(String polishWordDesc) {
        this.polishWordDesc = polishWordDesc;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getPolishWord() {
        return polishWord;
    }

    public void setPolishWord(String polishWord) {
        this.polishWord = polishWord;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
