package fiszki.pl.Fiszki.model;



import javax.persistence.*;

@Entity
@Table(name = "flashcards")
public class FlashCards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "englishWord_id")
    private EnglishWord englishWord;

    @ManyToOne
    @JoinColumn(name = "polishWord_id")
    private PolishWord polishWord;

    @ManyToOne
    @JoinColumn(name = "parts_of_speech_id")
    private PartsOfSpeech partsOfSpeech;

    @ManyToOne
    @JoinColumn(name = "topics_id")
    private Topics topics;

    @ManyToOne
    @JoinColumn(name = "levels_id")
    private Levels levels;

    public FlashCards() {
    }

    public FlashCards(EnglishWord englishWord, PolishWord polishWord, PartsOfSpeech partsOfSpeech, Topics topics, Levels levels) {
        this.englishWord = englishWord;
        this.polishWord = polishWord;
        this.partsOfSpeech = partsOfSpeech;
        this.topics = topics;
        this.levels = levels;
    }

    public Long getId() {
        return id;
    }

    public EnglishWord getEnglishWord() {
        return englishWord;
    }

    public PolishWord getPolishWord() {
        return polishWord;
    }

    public PartsOfSpeech getPartsOfSpeech() {
        return partsOfSpeech;
    }

    public Topics getTopics() {
        return topics;
    }

    public Levels getLevels() {
        return levels;
    }
}
