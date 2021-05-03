package pl.fiszki.Fiszki.models;

import javax.persistence.*;

@Entity
@Table(name = "english_word")
public class EnglishWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20)
    private String name;
    @Column
    private String description;

    public EnglishWord() {
    }

    public EnglishWord(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descryption) {
        this.description = descryption;
    }
}
