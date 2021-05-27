package pl.fiszki.Fiszki.models;

import javax.persistence.*;

@Entity
@Table(name = "english_word")
public class EnglishWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(
            length = 20,
            nullable = false)
    private String name;
    @Column
    private String description;

    public EnglishWord() {
    }

    public EnglishWord(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public EnglishWord(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "EnglishWord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
