package fiszki.pl.Fiszki.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "topics")
public class Topics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany(
            mappedBy = "topics",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    List<FlashCards> flashCardsList = new ArrayList<>();

    public Topics(String name) {
        this.name = name;
    }
}
