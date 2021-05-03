package fiszki.pl.Fiszki.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "parts_of_speech")
public class PartsOfSpeech {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany(
            mappedBy = "partsOfSpeech",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    List<FlashCards> flashCardsList = new ArrayList<>();

    public PartsOfSpeech(String name) {
        this.name = name;
    }

    public void setFlashCardsList(List<FlashCards> flashCardsList) {
        this.flashCardsList = flashCardsList;
    }
}
