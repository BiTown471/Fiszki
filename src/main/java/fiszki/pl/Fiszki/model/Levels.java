package fiszki.pl.Fiszki.model;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "levels")
public class Levels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",length = 3)
    private String name;
    @OneToMany(
            mappedBy = "levels",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    List<FlashCards> flashCardsList = new ArrayList<>();

    public Levels() {
    }

    public Levels(String name) {
        this.name = name;
    }

    public void setFlashCardsList(List<FlashCards> flashCardsList) {
        this.flashCardsList = flashCardsList;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
