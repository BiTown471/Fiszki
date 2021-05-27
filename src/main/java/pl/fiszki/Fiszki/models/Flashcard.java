package pl.fiszki.Fiszki.models;

import javax.persistence.*;

@Entity
@Table(name = "flashcards")
public class Flashcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",updatable = false)
    private Long id;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "englisz_word_id")
    private EnglishWord englishWord;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "polisz_word_id")
    private PolishWord polishWord;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "part_of_speech_id")
    private PartOfSpeech partOfSpeech;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "topic_id")
    private Topic topic;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "level_id")
    private Level level;
    public Flashcard() {
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(PartOfSpeech partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public PolishWord getPolishWord() {
        return polishWord;
    }

    public void setPolishWord(PolishWord polishWord) {
        this.polishWord = polishWord;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnglishWord getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(EnglishWord englishWord) {
        this.englishWord = englishWord;
    }

    @Override
    public String toString() {
        return "Flashcard{" +
                "id=" + id +
                ", englishWord=" + englishWord +
                ", polishWord=" + polishWord +
                ", partOfSpeech=" + partOfSpeech +
                ", topic=" + topic +
                ", level=" + level +
                '}';
    }
}
