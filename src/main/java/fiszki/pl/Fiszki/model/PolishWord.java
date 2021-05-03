package fiszki.pl.Fiszki.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "polish_word")
public class PolishWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 33)
    private String word;
    @Column
    private String wordDescription;
    @OneToMany(
            mappedBy = "polishWord",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    List<FlashCards> flashCardsList = new ArrayList<>();

    public PolishWord(String word, String wordDescription) {
        this.word = word;
        this.wordDescription = wordDescription;
    }

    public void setFlashCardsList(List<FlashCards> flashCardsList) {
        this.flashCardsList = flashCardsList;
    }
}
