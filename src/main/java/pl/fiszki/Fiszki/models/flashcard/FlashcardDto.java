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

    public FlashcardDto() {
    }

    public FlashcardDto(String englishWord, String englishWordDesc, String polishWord, String polishWordDesc, String partOfSpeech, String topic, String level) {
        this.englishWord = englishWord;
        this.englishWordDesc = englishWordDesc;
        this.polishWord = polishWord;
        this.polishWordDesc = polishWordDesc;
        this.partOfSpeech = partOfSpeech;
        this.topic = topic;
        this.level = level;
    }

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

    @Override
    public String toString() {
        return "FlashcardDto{" +
                "id=" + id +
                ", englishWord='" + englishWord + '\'' +
                ", englishWordDesc='" + englishWordDesc + '\'' +
                ", polishWord='" + polishWord + '\'' +
                ", polishWordDesc='" + polishWordDesc + '\'' +
                ", partOfSpeech='" + partOfSpeech + '\'' +
                ", topic='" + topic + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
