package pl.fiszki.Fiszki.models;

import javax.persistence.*;

@Entity
@Table(name = "polish_word")
public class PolishWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20)
    private String name;
    @Column
    private String description;

    public PolishWord() {
    }

    public PolishWord(String name, String description) {

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

    public String getDescryption() {
        return description;
    }

    public void setDescryption(String description) {
        this.description = description;
    }

}
